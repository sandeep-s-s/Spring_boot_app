package hello;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Controller;

@Controller
public class MainController {
    
    @RequestMapping("/")
    public String index() {
        return "home";
    }
    
    @GetMapping("/home")
    public String home() {
        return "home";
    }
}
