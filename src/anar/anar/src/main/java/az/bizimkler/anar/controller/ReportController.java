package anar.anar.src.main.java.az.bizimkler.anar.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;

import anar.anar.src.main.java.az.bizimkler.anar.DTO.ReportDTO;
import anar.anar.src.main.java.az.bizimkler.anar.service.*;

@RestController
@RequestMapping("/api/reports")
public class ReportController {

    @Autowired
    private ReportService reportService;

    @GetMapping("/income-expense")
    public ReportDTO getIncomesAndExpensesBetweenDates(@RequestParam Long userId,
                                                       @RequestParam String startDate,
                                                       @RequestParam String endDate) {
        LocalDate start = LocalDate.parse(startDate);
        LocalDate end = LocalDate.parse(endDate);
        return reportService.getIncomesAndExpensesBetweenDates(userId, start, end);
    }

    @GetMapping("/current-balance")
    public double getCurrentBalance(@RequestParam Long userId) {
        return reportService.getCurrentBalance(userId);
    }

    @GetMapping("/balance-at-date")
    public double getBalanceAtDate(@RequestParam Long userId, @RequestParam String date) {
        LocalDate targetDate = LocalDate.parse(date);
        return reportService.getBalanceAtDate(userId, targetDate);
    }
}