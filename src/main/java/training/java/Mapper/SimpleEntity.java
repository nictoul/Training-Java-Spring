package training.java.Mapper;

import lombok.Data;


@Data //Combine @ToString, @EqualsAndHashCode, @Getter / @Setter and @RequiredArgsConstructor together
public class SimpleEntity {
    public Long id;
    public String name;
}
