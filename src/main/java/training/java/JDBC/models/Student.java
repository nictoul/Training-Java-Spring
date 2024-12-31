package training.java.JDBC.models;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Student {
    private int RowNumber;
    private String Name;
    private int Age;


    public int getRowNumber() {        return RowNumber;    }
    public void setRowNumber(int rowNumber) {        RowNumber = rowNumber;    }
    public String getName() {        return Name;    }
    public void setName(String name) {        Name = name;    }
    public int getAge() {        return Age;    }
    public void setAge(int age) {        Age = age;    }

    @Override
    public String toString() {
        return "Student{" +
                "RowNumber=" + RowNumber +
                ", Name='" + Name + '\'' +
                ", Age=" + Age +
                '}';
    }
}