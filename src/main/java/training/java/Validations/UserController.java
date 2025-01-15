package training.java.Validations;

import jakarta.validation.Valid;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/users")
public class UserController {
    private static final Logger logger = LoggerFactory.getLogger(UserController.class);

    //curl to test: curl --location 'http://localhost:5170/users/createuser' --header 'Content-Type: application/json' --data-raw '{"id": 1,"name": "John Doe","email": "john.doe@example.com","age": 17}'
    @PostMapping("/createuser")
    public ResponseEntity<UserDto> createUser(@Valid @RequestBody UserDto userDTO) {
        // If validation fails, a MethodArgumentNotValidException will be thrown
        return ResponseEntity.ok(userDTO);
    }

    @PostMapping("/createUserSpecificHandleException")
    public ResponseEntity<?> createUserSpecificHandleException(@Valid @RequestBody UserDto userDTO, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            logger.error("This is the custom exception handler for a specific method (controller route)");
            // If there are validation errors, return a custom error response
            Map<String, String> errors = new HashMap<>();
            bindingResult.getAllErrors().forEach(error -> {
                String field = ((FieldError) error).getField();
                String message = error.getDefaultMessage();
                errors.put(field, message);
            });
            return ResponseEntity.badRequest().body(errors);
        }

        // Proceed with processing if no validation errors
        return ResponseEntity.ok(userDTO);
    }
}
