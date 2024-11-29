package anar.anar.src.main.java.az.bizimkler.anar.DTO;

import java.util.List;

import anar.anar.src.main.java.az.bizimkler.anar.entities.*;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class ReportDTO {
    private List<Income> incomes;
    private List<Expense> expenses;

    public ReportDTO(List<Income> incomes, List<Expense> expenses) {
        this.incomes = incomes;
        this.expenses = expenses;
    }

}