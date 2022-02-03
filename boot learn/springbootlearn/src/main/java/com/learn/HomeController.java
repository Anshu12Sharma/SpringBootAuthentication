package com.learn;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
@GetMapping("/home")
    public String home(){
    return "this is home page";
}
    @GetMapping("/login")
    public String login(){
        return "DO LOGIN";
    }
    @GetMapping("/register")
    public String register(){
        return "this is registration page";
    }
}

