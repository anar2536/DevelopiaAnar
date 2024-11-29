package anar.anar.src.main.java.az.bizimkler.anar.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import anar.anar.src.main.java.az.bizimkler.anar.entities.*;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
