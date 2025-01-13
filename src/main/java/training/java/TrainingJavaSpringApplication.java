package training.java;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import training.java.DependencyInjection.Developer;
import training.java.JDBC.models.Student;
import training.java.JDBC.repositories.StudentRepository;
import training.java.JDBC.services.StudentService;
import training.java.JPA_ORM.Repository.ShowJpaUsage;

@SpringBootApplication
public class TrainingJavaSpringApplication {
    static org.springframework.context.ConfigurableApplicationContext Context = null;

    public static void main(String[] args) {
        PrintEnvVariables();
        Context = SpringApplication.run(TrainingJavaSpringApplication.class, args);

        //TestDI();
        //TestLocalMicrosoftSQLServer();
        //TestJPAAndORM();
    }

    private static void PrintEnvVariables() {
        System.out.println("---------Env variables ------------");
        System.out.println("SPRING_DATASOURCE_URL: " + System.getenv("SPRING_DATASOURCE_URL"));
        System.out.println("DB_USERNAME: " + System.getenv("DB_USERNAME"));
        System.out.println("DB_PASSWORD: " + System.getenv("DB_PASSWORD"));
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

        service.DeleteStudent(s);

        service.AddStudent(s);

        service.getStudents();
    }

    public static void TestJPAAndORM(){
        var showJpa = Context.getBean(ShowJpaUsage.class);
        showJpa.ShowJpaUsage();
    }

}
