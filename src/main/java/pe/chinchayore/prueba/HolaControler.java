package pe.chinchayore.prueba;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HolaControler {
    @GetMapping("")
    String index(){
        return "index";
    }
}
