package anar.src.main.java.az.bizimkler.anar.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import anar.src.main.java.az.bizimkler.anar.entities.OrderDetailEntity;

public interface OrderDetailRepository extends JpaRepository<OrderDetailEntity, Long> {

}
