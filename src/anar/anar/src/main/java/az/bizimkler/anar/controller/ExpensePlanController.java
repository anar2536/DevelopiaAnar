package anar.anar.src.main.java.az.bizimkler.anar.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import anar.anar.src.main.java.az.bizimkler.anar.service.*;
import anar.anar.src.main.java.az.bizimkler.anar.entities.*;

@RestController
@RequestMapping("/api/expense-plans")
public class ExpensePlanController {

    @Autowired
    private ExpensePlanService expensePlanService;

    @PostMapping
    public ExpensePlan createExpensePlan(@RequestBody ExpensePlan expensePlan) {
        return expensePlanService.createExpensePlan(expensePlan);
    }

    @GetMapping("/{planId}/status")
    public String getPlanStatus(@PathVariable Long planId) {
        return expensePlanService.getPlanStatus(planId);
    }
}
