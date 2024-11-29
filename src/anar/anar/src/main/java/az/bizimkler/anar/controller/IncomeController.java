package anar.anar.src.main.java.az.bizimkler.anar.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

import anar.anar.src.main.java.az.bizimkler.anar.service.*;
import anar.anar.src.main.java.az.bizimkler.anar.entities.*;

@RestController
@RequestMapping("/api/incomes")
public class IncomeController {

    @Autowired
    private IncomeService incomeService;

    @GetMapping
    public List<Income> getAllIncomes() {
        return incomeService.getAllIncomes();
    }

    @GetMapping("/{id}")
    public Income getIncomeById(@PathVariable Long id) {
        return incomeService.getIncomeById(id);
    }

    @PostMapping
    public Income createIncome(@RequestBody Income income) {
        return incomeService.createIncome(income);
    }

    @PutMapping("/{id}")
    public Income updateIncome(@PathVariable Long id, @RequestBody Income incomeDetails) {
        return incomeService.updateIncome(id, incomeDetails);
    }

    @DeleteMapping("/{id}")
    public void deleteIncome(@PathVariable Long id) {
        incomeService.deleteIncome(id);
    }

    @GetMapping("/by-category-and-date")
    public List<Income> getIncomesByCategoryAndDateRange(@RequestParam Long categoryId,
                                                         @RequestParam String startDate,
                                                         @RequestParam String endDate) {
        LocalDate start = LocalDate.parse(startDate);
        LocalDate end = LocalDate.parse(endDate);
        IncomeCategory category = new IncomeCategory();
        category.setId(categoryId);
        return incomeService.getIncomesByCategoryAndDateRange(category, start, end);
    }

    @GetMapping("/by-date")
    public List<Income> getIncomesByDateRange(@RequestParam String startDate,
                                              @RequestParam String endDate) {
        LocalDate start = LocalDate.parse(startDate);
        LocalDate end = LocalDate.parse(endDate);
        return incomeService.getIncomesByDateRange(start, end);
    }
}
