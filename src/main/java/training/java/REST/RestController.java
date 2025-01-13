package training.java.REST;

import jakarta.servlet.http.HttpSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class RestController {
    private static final Logger logger = LoggerFactory.getLogger(RestController.class);

    @RequestMapping("/get") //specify to serve the base path. ex: localhost:8080
    public ResponseEntity home(){
        logger.info("RestController get route called");
        return ResponseEntity.ok("Hello world! You can rest if you are tire but you should try REST API instead");
    }

    @PostMapping("/post")
    public ResponseEntity showPostExample(@RequestParam String paramExample, @RequestParam(required = false) String optional, @RequestBody RestObject restObject){
        logger.info("RestController post route called");
        logger.info("paramExample: " + paramExample);
        logger.info("optional: " + optional);
        logger.info("SimpleObject: " + restObject);

        return ResponseEntity.ok("");
    }
}
