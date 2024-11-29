package anar.anar.src.main.java.az.bizimkler.anar.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import anar.anar.src.main.java.az.bizimkler.anar.repository.*;
import anar.anar.src.main.java.az.bizimkler.anar.entities.*;

@Service
public class IncomeCategoryService {

    @Autowired
    private IncomeCategoryRepository incomeCategoryRepository;

    public List<IncomeCategory> getAllCategories() {
        return incomeCategoryRepository.findAll();
    }

    public IncomeCategory getCategoryById(Long id) {
        return incomeCategoryRepository.findById(id).orElse(null);
    }

    public IncomeCategory createCategory(IncomeCategory category) {
        return incomeCategoryRepository.save(category);
    }

    public IncomeCategory updateCategory(Long id, IncomeCategory categoryDetails) {
        IncomeCategory category = incomeCategoryRepository.findById(id).orElse(null);
        if (category != null) {
            category.setName(categoryDetails.getName());
            category.setDescription(categoryDetails.getDescription());
            return incomeCategoryRepository.save(category);
        }
        return null;
    }

    public void deleteCategory(Long id) {
        incomeCategoryRepository.deleteById(id);
    }
}
