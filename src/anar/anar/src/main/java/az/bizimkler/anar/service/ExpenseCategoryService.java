package anar.anar.src.main.java.az.bizimkler.anar.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import anar.anar.src.main.java.az.bizimkler.anar.entities.*;
import anar.anar.src.main.java.az.bizimkler.anar.repository.*;

@Service
public class ExpenseCategoryService {

    @Autowired
    private ExpenseCategoryRepository expenseCategoryRepository;

    public List<ExpenseCategory> getAllCategories() {
        return expenseCategoryRepository.findAll();
    }

    public ExpenseCategory getCategoryById(Long id) {
        return expenseCategoryRepository.findById(id).orElse(null);
    }

    public ExpenseCategory createCategory(ExpenseCategory category) {
        return expenseCategoryRepository.save(category);
    }

    public ExpenseCategory updateCategory(Long id, ExpenseCategory categoryDetails) {
        ExpenseCategory category = expenseCategoryRepository.findById(id).orElse(null);
        if (category != null) {
            category.setName(categoryDetails.getName());
            category.setDescription(categoryDetails.getDescription());
            return expenseCategoryRepository.save(category);
        }
        return null;
    }

    public void deleteCategory(Long id) {
        expenseCategoryRepository.deleteById(id);
    }
}
