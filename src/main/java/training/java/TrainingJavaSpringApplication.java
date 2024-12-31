package training.java;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import training.java.DependencyInjection.Developer;

@SpringBootApplication
public class TrainingJavaSpringApplication {

    public static void main(String[] args) {

        var context = SpringApplication.run(TrainingJavaSpringApplication.class, args);
        Developer developer = (Developer) context.getBean("developer");
        developer.DoSomething();
    }

}
