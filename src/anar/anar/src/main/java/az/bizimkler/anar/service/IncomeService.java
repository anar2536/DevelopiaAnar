package anar.anar.src.main.java.az.bizimkler.anar.service;

import java.time.LocalDate;
import java.util.List;

import anar.anar.src.main.java.az.bizimkler.anar.repository.*;
import anar.anar.src.main.java.az.bizimkler.anar.entities.*;

@Service
public class IncomeService {

    @Autowired
    private IncomeRepository incomeRepository;

    public List<Income> getAllIncomes() {
        return incomeRepository.findAll();
    }

    public Income getIncomeById(Long id) {
        return incomeRepository.findById(id).orElse(null);
    }

    public Income createIncome(Income income) {
        return incomeRepository.save(income);
    }

    public Income updateIncome(Long id, Income incomeDetails) {
        Income income = incomeRepository.findById(id).orElse(null);
        if (income != null) {
            income.setDescription(incomeDetails.getDescription());
            income.setAmount(incomeDetails.getAmount());
            income.setDate(incomeDetails.getDate());
            income.setCategory(incomeDetails.getCategory());
            return incomeRepository.save(income);
        }
        return null;
    }

    public void deleteIncome(Long id) {
        incomeRepository.deleteById(id);
    }

    public List<Income> getIncomesByCategoryAndDateRange(IncomeCategory category, LocalDate startDate, LocalDate endDate) {
        return incomeRepository.findByCategoryAndDateBetween(category, startDate, endDate);
    }

    public List<Income> getIncomesByDateRange(LocalDate startDate, LocalDate endDate) {
        return incomeRepository.findByDateBetween(startDate, endDate);
    }
}
