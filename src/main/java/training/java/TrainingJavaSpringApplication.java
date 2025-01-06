package training.java;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import training.java.DependencyInjection.Developer;
import training.java.JDBC.models.Student;
import training.java.JDBC.services.StudentService;

import java.util.List;

@SpringBootApplication
public class TrainingJavaSpringApplication {

    public static void main(String[] args) {

        var context = SpringApplication.run(TrainingJavaSpringApplication.class, args);
        Developer developer = (Developer) context.getBean("developer");
        developer.DoSomething();

        Student s= context.getBean(Student.class);
        s.setRowNumber(104);
        s.setName("Navin");
        s.setAge(78);
        StudentService service=context.getBean(StudentService.class);
        service.AddStudent(s);

        service.DeleteStudent(s);
//        List<Student> students=service.getStudents();
//        System.out.println(students);
    }

}
