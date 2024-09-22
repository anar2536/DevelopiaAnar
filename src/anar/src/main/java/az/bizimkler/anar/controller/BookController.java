package anar.src.main.java.az.bizimkler.anar.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import anar.src.main.java.az.bizimkler.anar.entities.BookEntity;
import anar.src.main.java.az.bizimkler.anar.service.BookService;
import anar.src.main.java.az.bizimkler.anar.response.BookResponseDTO;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    private BookService bookService;

    // 1. Kitap kaydetme
    @PostMapping("/save")
    public BookResponseDTO<BookEntity> saveBook(@RequestBody BookEntity book) {
        BookEntity savedBook = bookService.saveBook(book);
        return new BookResponseDTO(savedBook, HttpStatus.CREATED);
    }

    // 2. Tüm kitapları listeleme
    @GetMapping("/all")
    public ResponseEntity<List<BookEntity>> getAllBooks() {
        List<BookEntity> books = bookService.getAllBooks();
        return new ResponseEntity<>(books, HttpStatus.OK);
    }

    // 3. Kitapları sayfalama ile listeleme
    @GetMapping("/paginate")
    public ResponseEntity<List<BookEntity>> getBooksPagination(
            @RequestParam("begin") Integer begin,
            @RequestParam("length") Integer length) {
        List<BookEntity> books = bookService.getBooksByPagination(begin, length);
        return new ResponseEntity<>(books, HttpStatus.OK);
    }

    // 4. Toplam kitap sayısını getirme
    @GetMapping("/count")
    public ResponseEntity<Integer> getTotalBooksCount() {
        Integer count = bookService.getTotalBooksCount();
        return new ResponseEntity<>(count, HttpStatus.OK);
    }

    // 5. Kitapları isme göre arama
    @GetMapping("/search")
    public ResponseEntity<List<BookEntity>> searchBooksByName(@RequestParam("name") String name) {
        List<BookEntity> books = bookService.searchBooksByName(name);
        return new ResponseEntity<>(books, HttpStatus.OK);
    }

    // 6. Creator'a göre sayfalama
    @GetMapping("/creator/paginate")
    public ResponseEntity<List<BookEntity>> getBooksByCreatorPagination(
            @RequestParam("creator") String creator,
            @RequestParam("begin") Integer begin,
            @RequestParam("length") Integer length) {
        List<BookEntity> books = bookService.getBooksByCreatorPagination(creator, begin, length);
        return new ResponseEntity<>(books, HttpStatus.OK);
    }
}

