//package training.java.JPA_ORM.Repository;
//
//import org.springframework.stereotype.Service;
//
//@Service
//public class ShowJpaUsage {
//
//    private final StudentRepo studentRepo;
//
//    public ShowJpaUsage(StudentRepo studentRepo) {
//        this.studentRepo = studentRepo;
//    }
//
//    public void ShowJpaUsage(){
//        //Table will be automatically created if not . (with spring.jpa.hibernate.ddl-auto=update app.property
//
//        var student1 = new StudentJpa();
//        var student2 = new StudentJpa();
//
//        student1.setRowNumber(104);
//        student1.setName("Navin");
//        student1.setAge(78);
//
//        student2.setRowNumber(123);
//        student2.setName("Nicos");
//        student2.setAge(156);
//
//        studentRepo.save(student1);
//        studentRepo.save(student2);
//
//        var studentJpa = studentRepo.findAll();
//        System.out.println(studentJpa);
//    }
//}
