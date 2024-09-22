package anar.src.main.java.az.bizimkler.anar.service;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import anar.src.main.java.az.bizimkler.anar.repository.StudentRepository;
import anar.src.main.java.az.bizimkler.anar.entities.StudentEntity;

import lombok.RequiredArgsConstructor;

@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;

    public StudentEntity saveStudent(StudentEntity student) {
        return studentRepository.save(student);
    }

    public List<StudentEntity> getAllStudents() {
        return studentRepository.findAll();

