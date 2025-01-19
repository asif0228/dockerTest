package com.example.dockerTest.Service;

import com.example.dockerTest.Repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

@Service
public class HomeService {
    @Autowired
    UserRepo userRepo;

    public ModelAndView home(String viewName){
        ModelAndView mv = new ModelAndView(viewName);

        mv.addObject("users",userRepo.findAll());

        return mv;
    }
}
