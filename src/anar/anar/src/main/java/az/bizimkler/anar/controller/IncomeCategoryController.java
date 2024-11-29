package anar.anar.src.main.java.az.bizimkler.anar.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import anar.anar.src.main.java.az.bizimkler.anar.service.*;
import anar.anar.src.main.java.az.bizimkler.anar.entities.*;

@RestController
@RequestMapping("/api/income-categories")
public class IncomeCategoryController {

    @Autowired
    private IncomeCategoryService incomeCategoryService;

    @GetMapping
    public List<IncomeCategory> getAllCategories() {
        return incomeCategoryService.getAllCategories();
    }

    @GetMapping("/{id}")
    public IncomeCategory getCategoryById(@PathVariable Long id) {
        return incomeCategoryService.getCategoryById(id);
    }

    @PostMapping
    public IncomeCategory createCategory(@RequestBody IncomeCategory category) {
        return incomeCategoryService.createCategory(category);
    }

    @PutMapping("/{id}")
    public IncomeCategory updateCategory(@PathVariable Long id, @RequestBody IncomeCategory categoryDetails) {
        return incomeCategoryService.updateCategory(id, categoryDetails);
    }

    @DeleteMapping("/{id}")
    public void deleteCategory(@PathVariable Long id) {
        incomeCategoryService.deleteCategory(id);
    }
}
