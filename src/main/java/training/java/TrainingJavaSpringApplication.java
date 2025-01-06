package training.java;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import training.java.DependencyInjection.Developer;
import training.java.JDBC.models.Student;
import training.java.JDBC.services.StudentService;

@SpringBootApplication
public class TrainingJavaSpringApplication {
    static org.springframework.context.ConfigurableApplicationContext Context = null;

    public static void main(String[] args) {
        Context = SpringApplication.run(TrainingJavaSpringApplication.class, args);

        TestDI();
        TestLocalMicrosoftSQLServer();
    }

    public static void TestDI(){
        Developer developer = (Developer) Context.getBean("developer");
        developer.DoSomething();
    }

    public static void TestLocalMicrosoftSQLServer(){
        Student s= Context.getBean(Student.class);
        s.setRowNumber(104);
        s.setName("Navin");
        s.setAge(78);
        StudentService service=Context.getBean(StudentService.class);

        service.AddStudent(s);

        service.getStudents();

        service.DeleteStudent(s);
    }

}
