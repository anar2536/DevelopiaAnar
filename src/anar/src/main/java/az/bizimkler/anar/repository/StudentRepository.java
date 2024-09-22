package anar.src.main.java.az.bizimkler.anar.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import anar.src.main.java.az.bizimkler.anar.entities.StudentEntity;

public interface OrderRepository extends JpaRepository<StudentEntity, Long> {

}