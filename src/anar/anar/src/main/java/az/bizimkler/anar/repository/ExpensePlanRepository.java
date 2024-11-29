package anar.anar.src.main.java.az.bizimkler.anar.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDate;

import anar.anar.src.main.java.az.bizimkler.anar.entities.*;

public interface ExpensePlanRepository extends JpaRepository<ExpensePlan, Long> {
    @Query("SELECT SUM(e.amount) FROM Expense e WHERE e.userId = :userId AND e.date BETWEEN :startDate AND :endDate")
    Double sumAmountByUserIdAndDateBetween(
            @Param("userId") Long userId,
            @Param("startDate") LocalDate startDate,
            @Param("endDate") LocalDate endDate
    );
}
