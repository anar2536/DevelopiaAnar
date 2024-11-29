package anar.anar.src.main.java.az.bizimkler.anar.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

import anar.anar.src.main.java.az.bizimkler.anar.service.*;
import anar.anar.src.main.java.az.bizimkler.anar.entities.*;

@RestController
@RequestMapping("/api/expenses")
public class ExpenseController {

    @Autowired
    private ExpenseService expenseService;

    @GetMapping
    public List<Expense> getAllExpenses() {
        return expenseService.getAllExpenses();
    }

    @GetMapping("/{id}")
    public Expense getExpenseById(@PathVariable Long id) {
        return expenseService.getExpenseById(id);
    }

    @PostMapping
    public Expense createExpense(@RequestBody Expense expense) {
        return expenseService.createExpense(expense);
    }

    @PutMapping("/{id}")
    public Expense updateExpense(@PathVariable Long id, @RequestBody Expense expenseDetails) {
        return expenseService.updateExpense(id, expenseDetails);
    }

    @DeleteMapping("/{id}")
    public void deleteExpense(@PathVariable Long id) {
        expenseService.deleteExpense(id);
    }

    @GetMapping("/by-category-and-date")
    public List<Expense> getExpensesByCategoryAndDateRange(@RequestParam Long categoryId,
                                                           @RequestParam String startDate,
                                                           @RequestParam String endDate) {
        LocalDate start = LocalDate.parse(startDate);
        LocalDate end = LocalDate.parse(endDate);
        ExpenseCategory category = new ExpenseCategory();
        category.setId(categoryId);
        return expenseService.getExpensesByCategoryAndDateRange(category, start, end);
    }

    @GetMapping("/by-date")
    public List<Expense> getExpensesByDateRange(@RequestParam String startDate,
                                                @RequestParam String endDate) {
        LocalDate start = LocalDate.parse(startDate);
        LocalDate end = LocalDate.parse(endDate);
        return expenseService.getExpensesByDateRange(start, end);
    }
}