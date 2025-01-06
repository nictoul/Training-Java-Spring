package training.java.Web.Controllers;

import jakarta.servlet.http.HttpSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import training.java.Web.models.SimpleObject;

@Controller
public class HomeController {
    private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

    @RequestMapping("/") //specify to serve the base path. ex: localhost:8080
    public String home(){
        logger.info("HomeController called");
        return "index";
    }

    @RequestMapping("/addMethod")
    public ModelAndView add(@RequestParam("num1") int differentName, int num2, ModelAndView mv){
        logger.info("HomeController add called");
        int result = differentName + num2;
        mv.addObject("result", result);
        mv.setViewName("result");
        return mv;
    }

    @RequestMapping("/forminput")
    public String formInput(){
        logger.info("HomeController FormInput called");
        return "posttoserver";
    }

    //curl example: http://localhost:8080/useObject?id=123&name=toto
    @RequestMapping("/useObject")
    @ResponseBody //specify to not look for a view (the tomcat-jasper dependency) and return plain text
    public String useObject(SimpleObject simpleObject){
        logger.info("HomeController useObject called");
        logger.info("SimpleObject: " + simpleObject);
        return simpleObject.toString();
    }

    @RequestMapping("/session")
    public String showSessionUsage(HttpSession session){
        logger.info("HomeController showSessionUsage called");

        session.setAttribute("result", "This is an example");
        return "session";
    }
}
