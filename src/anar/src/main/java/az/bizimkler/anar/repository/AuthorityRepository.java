package anar.src.main.java.az.bizimkler.anar.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import anar.src.main.java.az.bizimkler.anar.entities.AuthorityEntity;

public interface AuthorityRepository extends JpaRepository<AuthorityEntity, Long> {

    List<AuthorityEntity> findAllByUsername(String username);
}
