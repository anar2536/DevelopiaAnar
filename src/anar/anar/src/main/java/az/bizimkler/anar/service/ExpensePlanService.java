package anar.anar.src.main.java.az.bizimkler.anar.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import anar.anar.src.main.java.az.bizimkler.anar.repository.*;
import anar.anar.src.main.java.az.bizimkler.anar.entities.*;

@Service
public class ExpensePlanService {

    @Autowired
    private ExpensePlanRepository expensePlanRepository;

    @Autowired
    private ExpenseRepository expenseRepository;

    public ExpensePlan createExpensePlan(ExpensePlan expensePlan) {
        return expensePlanRepository.save(expensePlan);
    }

    public String getPlanStatus(Long planId) {
        ExpensePlan plan = expensePlanRepository.findById(planId).orElse(null);
        if (plan == null) {
            return "Plan bulunamadı";
        }

        long totalDays = ChronoUnit.DAYS.between(plan.getStartDate(), plan.getEndDate()) + 1;
        double dailyLimit = plan.getTargetAmount() / totalDays;

        long daysPassed = ChronoUnit.DAYS.between(plan.getStartDate(), LocalDate.now());
        if (daysPassed < 0) daysPassed = 0;

        double allowedSpending = daysPassed * dailyLimit;

        double actualSpending = expenseRepository.sumAmountByUserIdAndDateBetween(
                plan.getUserId(), plan.getStartDate(), LocalDate.now()
        );

        double difference = allowedSpending - actualSpending;
        if (difference < 0) {
            return "Hedefin gerisindesiniz. Fazladan harcanan miktar: " + (-difference);
        } else {
            return "Hedefe uygunsunuz. Kalan miktar: " + difference;
        }
    }
}
