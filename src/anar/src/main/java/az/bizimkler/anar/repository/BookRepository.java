package anar.src.main.java.az.bizimkler.anar.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import anar.src.main.java.az.bizimkler.anar.entities.BookEntity;

public interface BookRepository extends JpaRepository<BookEntity, Long> {

    @Query(value = "select * from books limit ?1,?2", nativeQuery = true)
    List<BookEntity> findAllPagination(Integer begin, Integer length);

    // findAllPagination(3,10)

    @Query(value = "select count(*) from books", nativeQuery = true)
    Integer findAllCount();

    @Query(value = "select * from books where name like %?1%", nativeQuery = true)
    List<BookEntity> findAllSearch(String name);

    @Query(value = "select * from books where creator =  ?1 limit ?2,?3", nativeQuery = true)
    List<BookEntity> findAllByCreatorPagination(String creator, Integer begin, Integer length);

}
