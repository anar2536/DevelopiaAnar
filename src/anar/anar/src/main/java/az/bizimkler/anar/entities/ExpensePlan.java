package anar.anar.src.main.java.az.bizimkler.anar.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Getter
@Setter
public class ExpensePlan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long userId;
    private double targetAmount;
    private LocalDate startDate;
    private LocalDate endDate;

}