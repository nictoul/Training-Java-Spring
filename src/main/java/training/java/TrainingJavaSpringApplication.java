package training.java;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import training.java.DependencyInjection.Developer;
import training.java.JDBC.models.Student;
import training.java.JDBC.repositories.StudentRepository;
import training.java.JDBC.services.StudentService;
import training.java.JPA_ORM.Repository.StudentJpa;
import training.java.JPA_ORM.Repository.StudentRepo;

@SpringBootApplication
public class TrainingJavaSpringApplication {
    static org.springframework.context.ConfigurableApplicationContext Context = null;

    public static void main(String[] args) {
        Context = SpringApplication.run(TrainingJavaSpringApplication.class, args);

        //TestDI();
        //TestLocalMicrosoftSQLServer();
        TestJPAAndORM();
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
        //Table will be automatically created if not . (with spring.jpa.hibernate.ddl-auto=update app.property
        var repo = Context.getBean(StudentRepo.class);

        var student1 = Context.getBean(StudentJpa.class);
        var student2 = Context.getBean(StudentJpa.class);

        student1.setRowNumber(104);
        student1.setName("Navin");
        student1.setAge(78);

        student2.setRowNumber(123);
        student2.setName("Nicos");
        student2.setAge(156);

        repo.save(student1);
        repo.save(student2);

        var studentJpa = repo.findAll();
        System.out.println(studentJpa);

    }

}
