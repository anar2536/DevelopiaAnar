package anar.anar.src.main.java.az.bizimkler.anar.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDate;
import java.util.List;

import anar.anar.src.main.java.az.bizimkler.anar.entities.*;

public interface IncomeRepository extends JpaRepository<Income, Long> {

    List<Income> findByCategoryAndDateBetween(IncomeCategory category, LocalDate startDate, LocalDate endDate);

    @Query("SELECT i FROM Income i WHERE i.date BETWEEN :startDate AND :endDate")
    List<Income> findByDateBetween(@Param("startDate") LocalDate startDate, @Param("endDate") LocalDate endDate);

    List<Income> findByUserIdAndDateBetween(Long userId, LocalDate startDate, LocalDate endDate);

    @Query("SELECT SUM(i.amount) FROM Income i WHERE i.userId = :userId")
    double sumAmountByUserId(@Param("userId") Long userId);

    @Query("SELECT SUM(i.amount) FROM Income i WHERE i.userId = :userId AND i.date < :endDate")
    double sumAmountByUserIdAndDateBefore(@Param("userId") Long userId, @Param("endDate") LocalDate endDate);
}
