package anar.anar.src.main.java.az.bizimkler.anar.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

import anar.anar.src.main.java.az.bizimkler.anar.repository.*;
import anar.anar.src.main.java.az.bizimkler.anar.entities.*;
import anar.anar.src.main.java.az.bizimkler.anar.DTO.ReportDTO;

@Service
public class ReportService {

    @Autowired
    private IncomeRepository incomeRepository;

    @Autowired
    private ExpenseRepository expenseRepository;

    public ReportDTO getIncomesAndExpensesBetweenDates(Long userId, LocalDate startDate, LocalDate endDate) {
        List<Income> incomes = incomeRepository.findByUserIdAndDateBetween(userId, startDate, endDate);
        List<Expense> expenses = expenseRepository.findByUserIdAndDateBetween(userId, startDate, endDate);

        return new ReportDTO(incomes, expenses);
    }

    public double getCurrentBalance(Long userId) {
        double totalIncome = incomeRepository.sumAmountByUserId(userId);
        double totalExpense = expenseRepository.sumAmountByUserId(userId);
        return totalIncome - totalExpense;
    }

    public double getBalanceAtDate(Long userId, LocalDate date) {
        double incomeUntilDate = incomeRepository.sumAmountByUserIdAndDateBefore(userId, date.plusDays(1));
        double expenseUntilDate = expenseRepository.sumAmountByUserIdAndDateBefore(userId, date.plusDays(1));
        return incomeUntilDate - expenseUntilDate;
    }
}
