package kz.kaznitu.controllers;

import kz.kaznitu.domains.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String home(@ModelAttribute("user")User user){
        return "home" ;
    }

    @RequestMapping(value="/check-user", method = RequestMethod.POST)
    public ModelAndView check(@ModelAttribute("user")User user){
        return new ModelAndView("result", "user", user) ;
    }
}
