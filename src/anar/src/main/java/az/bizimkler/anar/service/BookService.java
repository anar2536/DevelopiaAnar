package anar.src.main.java.az.bizimkler.anar.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import anar.src.main.java.az.bizimkler.anar.entities.BookEntity;
import anar.src.main.java.az.bizimkler.anar.repositories.BookRepository;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    public BookEntity saveBook(BookEntity book) {
        return bookRepository.save(book);
    }

    public List<BookEntity> getAllBooks() {
        return bookRepository.findAll();
    }
}
