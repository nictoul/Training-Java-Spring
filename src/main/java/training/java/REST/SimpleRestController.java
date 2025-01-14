package training.java.REST;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class SimpleRestController {
    private static final Logger logger = LoggerFactory.getLogger(SimpleRestController.class);

    @GetMapping("/get") //specify to serve the base path. ex: localhost:8080
    public ResponseEntity home(){
        logger.info("RestController get route called");
        return ResponseEntity.ok("Hello world! You can rest if you are tire but you should try REST API instead");
    }

    //    curl --location 'http://localhost:8080/post?paramExample=this%20parameter%20is%20mandatory' --header 'Content-Type: application/json' --data '{"id": 123,"name": "toto"}'
    @PostMapping("/post")
    public ResponseEntity showPostExample(@RequestParam String paramExample, @RequestParam(required = false) String optional, @RequestBody RestObject restObject){
        logger.info("RestController post route called");
        logger.info("paramExample: " + paramExample);
        logger.info("optional: " + optional);
        logger.info("RestObject: " + restObject);

        return ResponseEntity.ok("");
    }
}
