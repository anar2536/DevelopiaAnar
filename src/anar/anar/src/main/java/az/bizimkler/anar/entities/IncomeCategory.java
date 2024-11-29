package anar.anar.src.main.java.az.bizimkler.anar.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Getter
@Setter
public class Income {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String description;
    private double amount;
    private LocalDate date;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private IncomeCategory category;
}
