package training.java.JDBC.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import training.java.JDBC.repositories.StudentRepository;
import training.java.JDBC.models.Student;

import java.util.List;

@Service
public class StudentService {

    private static final Logger logger = LoggerFactory.getLogger(StudentService.class);

    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public void AddStudent(Student student) {
        logger.info("Service - Adding student: " + student);
        studentRepository.save(student);
    }

    public List<Student> getStudents() {
        return studentRepository.findAll();
    }

    public void DeleteStudent(Student s) {
        studentRepository.delete(s);
    }
}