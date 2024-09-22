package anar.src.main.java.az.bizimkler.anar.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import anar.src.main.java.az.bizimkler.anar.entities.StudentEntity;
import anar.src.main.java.az.bizimkler.anar.repository.StudentRepository;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    // Öğrenci kaydetme
    public StudentEntity saveStudent(StudentEntity student) {
        return studentRepository.save(student);
    }

    // Tüm öğrencileri listeleme
    public List<StudentEntity> getAllStudents() {
        return studentRepository.findAll();
    }

    // ID'ye göre öğrenci bulma
    public StudentEntity getStudentById(Long id) {
        return studentRepository.findById(id).orElse(null);
    }
}
