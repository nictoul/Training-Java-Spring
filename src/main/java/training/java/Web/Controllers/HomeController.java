package training.java.Web.Controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

    @RequestMapping("/") //specify to serve the base path. ex: localhost:8080
    public String home(){
        logger.info("HomeController called");
        return "index.jsp";
    }
}
