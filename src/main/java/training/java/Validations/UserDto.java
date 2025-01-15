package training.java.Validations;

import jakarta.validation.constraints.*;
import lombok.Data;

@Data
public class UserDto {
    @NotNull(message = "ID cannot be null")
    private Long id;

    @NotBlank(message = "Name cannot be blank")
    @Size(min = 2, max = 100, message = "Name must be between 2 and 100 characters")
    private String name;

    @Email(message = "Invalid email address")
    private String email;

    @Min(value = 18, message = "Age must be at least 18")
    private int age;
}
