package com.example.dockerTest.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
    @GetMapping(value = "")
    public ModelAndView home(){
        return new ModelAndView("Home/home.html");
    }
}
