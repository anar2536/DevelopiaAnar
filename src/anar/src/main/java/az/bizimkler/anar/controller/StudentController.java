package anar.src.main.java.az.bizimkler.anar.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import anar.src.main.java.az.bizimkler.anar.entities.StudentEntity;
import anar.src.main.java.az.bizimkler.anar.entities.BookEntity;
import anar.src.main.java.az.bizimkler.anar.service.StudentService;
import anar.src.main.java.az.bizimkler.anar.service.BookService;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @Autowired
    private BookService bookService;

    @PostMapping("/save")
    public ResponseEntity<StudentEntity> saveStudent(@RequestBody StudentEntity student) {
        StudentEntity savedStudent = studentService.saveStudent(student);
        return new ResponseEntity<>(savedStudent, HttpStatus.CREATED);
    }

    @GetMapping("/all")
    public ResponseEntity<List<StudentEntity>> getAllStudents() {
        List<StudentEntity> students = studentService.getAllStudents();
        return new ResponseEntity<>(students, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<StudentEntity> getStudentById(@PathVariable("id") Long id) {
        StudentEntity student = studentService.getStudentById(id);
        if (student != null) {
            return new ResponseEntity<>(student, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/{studentId}/books/{bookId}")
    public ResponseEntity<String> assignBookToStudent(@PathVariable Long studentId, @PathVariable Long bookId) {
        StudentEntity student = studentService.getStudentById(studentId);
        BookEntity book = bookService.getBookById(bookId);

        if (student != null && book != null) {
            student.getBooks().add(book);
            studentService.saveStudent(student);
            return new ResponseEntity<>("Kitap öğrenciye verildi.", HttpStatus.OK);
        } else {
            return new ResponseEntity<>("Öğrenci veya kitap bulunamadı.", HttpStatus.NOT_FOUND);  Found
        }
    }
}
