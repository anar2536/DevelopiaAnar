package anar.src.main.java.az.bizimkler.anar.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import anar.src.main.java.az.bizimkler.anar.entities.BookEntity;
import anar.src.main.java.az.bizimkler.anar.repository.BookRepository;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    // Kitap kaydetme
    public BookEntity saveBook(BookEntity book) {
        return bookRepository.save(book);
    }

    // Tüm kitapları listeleme
    public List<BookEntity> getAllBooks() {
        return bookRepository.findAll();
    }

    // Sayfalama ile kitap listeleme
    public List<BookEntity> getBooksByPagination(Integer begin, Integer length) {
        return bookRepository.findAllPagination(begin, length);
    }

    // Toplam kitap sayısını getirme
    public Integer getTotalBooksCount() {
        return bookRepository.findAllCount();
    }

    // İsme göre kitap arama
    public List<BookEntity> searchBooksByName(String name) {
        return bookRepository.findAllSearch(name);
    }

    // Creator'a göre sayfalama ile kitap listeleme
    public List<BookEntity> getBooksByCreatorPagination(String creator, Integer begin, Integer length) {
        return bookRepository.findAllByCreatorPagination(creator, begin, length);
    }
}
