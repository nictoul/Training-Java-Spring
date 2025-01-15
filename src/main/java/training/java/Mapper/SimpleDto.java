package training.java.Mapper;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SimpleDto {
    public Long id;
    public String name;

    //lombok provide the @ToString annotation or the @data (that include many annotation)
    @Override
    public String toString() {
        return "SimpleDto{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
