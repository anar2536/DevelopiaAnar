package anar.anar.src.main.java.az.bizimkler.anar.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDate;
import java.util.List;

import anar.anar.src.main.java.az.bizimkler.anar.entities.*;

public interface ExpenseRepository extends JpaRepository<Expense, Long> {

    List<Expense> findByCategoryAndDateBetween(ExpenseCategory category, LocalDate startDate, LocalDate endDate);

    @Query("SELECT e FROM Expense e WHERE e.date BETWEEN :startDate AND :endDate")
    List<Expense> findByDateBetween(@Param("startDate") LocalDate startDate, @Param("endDate") LocalDate endDate);

    List<Expense> findByUserIdAndDateBetween(Long userId, LocalDate startDate, LocalDate endDate);

    @Query("SELECT SUM(e.amount) FROM Expense e WHERE e.userId = :userId")
    double sumAmountByUserId(@Param("userId") Long userId);

    @Query("SELECT SUM(e.amount) FROM Expense e WHERE e.userId = :userId AND e.date < :endDate")
    double sumAmountByUserIdAndDateBefore(@Param("userId") Long userId, @Param("endDate") LocalDate endDate);

    @Query("SELECT SUM(e.amount) FROM Expense e WHERE e.userId = :userId AND e.date BETWEEN :startDate AND :endDate")
    Double sumAmountByUserIdAndDateBetween(
            @Param("userId") Long userId,
            @Param("startDate") LocalDate startDate,
            @Param("endDate") LocalDate endDate
    );
}
