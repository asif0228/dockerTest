package com.example.dockerTest.Controller;

import com.example.dockerTest.Service.HomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
    @Autowired
    HomeService homeService;
    @GetMapping(value = "")
    public ModelAndView home(){
        return homeService.home("Home/home.html");
    }
}
