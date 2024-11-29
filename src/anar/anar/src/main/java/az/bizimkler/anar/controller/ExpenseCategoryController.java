package anar.anar.src.main.java.az.bizimkler.anar.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import anar.anar.src.main.java.az.bizimkler.anar.service.*;
import anar.anar.src.main.java.az.bizimkler.anar.entities.*;

@RestController
@RequestMapping("/api/expense-categories")
public class ExpenseCategoryController {

    @Autowired
    private ExpenseCategoryService expenseCategoryService;

    @GetMapping
    public List<ExpenseCategory> getAllCategories() {
        return expenseCategoryService.getAllCategories();
    }

    @GetMapping("/{id}")
    public ExpenseCategory getCategoryById(@PathVariable Long id) {
        return expenseCategoryService.getCategoryById(id);
    }

    @PostMapping
    public ExpenseCategory createCategory(@RequestBody ExpenseCategory category) {
        return expenseCategoryService.createCategory(category);
    }

    @PutMapping("/{id}")
    public ExpenseCategory updateCategory(@PathVariable Long id, @RequestBody ExpenseCategory categoryDetails) {
        return expenseCategoryService.updateCategory(id, categoryDetails);
    }

    @DeleteMapping("/{id}")
    public void deleteCategory(@PathVariable Long id) {
        expenseCategoryService.deleteCategory(id);
    }
}
