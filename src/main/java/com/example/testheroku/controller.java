package com.example.testheroku;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class controller {
    @GetMapping("/")
    public String getWelcome(){
        return "welcome";
    }
}
