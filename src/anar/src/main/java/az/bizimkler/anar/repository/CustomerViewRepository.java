package anar.src.main.java.az.bizimkler.anar.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import anar.src.main.java.az.bizimkler.anar.entities.CustomerViewEntity;

public interface CustomerViewRepository extends JpaRepository<CustomerViewEntity, Long> {

}