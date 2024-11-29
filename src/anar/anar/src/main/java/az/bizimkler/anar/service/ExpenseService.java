package anar.anar.src.main.java.az.bizimkler.anar.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

import anar.anar.src.main.java.az.bizimkler.anar.repository.*;
import anar.anar.src.main.java.az.bizimkler.anar.entities.*;

@Service
public class ExpenseService {

    @Autowired
    private ExpenseRepository expenseRepository;

    public List<Expense> getAllExpenses() {
        return expenseRepository.findAll();
    }

    public Expense getExpenseById(Long id) {
        return expenseRepository.findById(id).orElse(null);
    }

    public Expense createExpense(Expense expense) {
        return expenseRepository.save(expense);
    }

    public Expense updateExpense(Long id, Expense expenseDetails) {
        Expense expense = expenseRepository.findById(id).orElse(null);
        if (expense != null) {
            expense.setDescription(expenseDetails.getDescription());
            expense.setAmount(expenseDetails.getAmount());
            expense.setDate(expenseDetails.getDate());
            expense.setCategory(expenseDetails.getCategory());
            return expenseRepository.save(expense);
        }
        return null;
    }

    public void deleteExpense(Long id) {
        expenseRepository.deleteById(id);
    }

    public List<Expense> getExpensesByCategoryAndDateRange(ExpenseCategory category, LocalDate startDate, LocalDate endDate) {
        return expenseRepository.findByCategoryAndDateBetween(category, startDate, endDate);
    }

    public List<Expense> getExpensesByDateRange(LocalDate startDate, LocalDate endDate) {
        return expenseRepository.findByDateBetween(startDate, endDate);
    }
}
