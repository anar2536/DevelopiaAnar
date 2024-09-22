package anar.src.main.java.az.bizimkler.anar.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import anar.src.main.java.az.bizimkler.anar.entities.BookEntity;
import anar.src.main.java.az.bizimkler.anar.service.BookService;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    private BookService bookService;


    @PostMapping("/save")
    public ResponseEntity<BookEntity> saveBook(@RequestBody BookEntity book) {
        BookEntity savedBook = bookService.saveBook(book);
        return new ResponseEntity<>(savedBook, HttpStatus.CREATED); // 201 Created
    }

    @GetMapping("/all")
    public ResponseEntity<List<BookEntity>> getAllBooks() {
        List<BookEntity> books = bookService.getAllBooks();
        return new ResponseEntity<>(books, HttpStatus.OK); // 200 OK
    }


    @GetMapping("/paginate")
    public ResponseEntity<List<BookEntity>> getBooksPagination(
            @RequestParam("begin") Integer begin,
            @RequestParam("length") Integer length) {
        List<BookEntity> books = bookService.getBooksByPagination(begin, length);
        return new ResponseEntity<>(books, HttpStatus.OK); // 200 OK
    }


    @GetMapping("/count")
    public ResponseEntity<Integer> getTotalBooksCount() {
        Integer count = bookService.getTotalBooksCount();
        return new ResponseEntity<>(count, HttpStatus.OK); // 200 OK
    }


    @GetMapping("/search")
    public ResponseEntity<List<BookEntity>> searchBooksByName(@RequestParam("name") String name) {
        List<BookEntity> books = bookService.searchBooksByName(name);
        return new ResponseEntity<>(books, HttpStatus.OK); // 200 OK
    }


    @GetMapping("/creator/paginate")
    public ResponseEntity<List<BookEntity>> getBooksByCreatorPagination(
            @RequestParam("creator") String creator,
            @RequestParam("begin") Integer begin,
            @RequestParam("length") Integer length) {
        List<BookEntity> books = bookService.getBooksByCreatorPagination(creator, begin, length);
        return new ResponseEntity<>(books, HttpStatus.OK); // 200 OK
    }
}
