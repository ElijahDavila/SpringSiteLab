package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
    
    @GetMapping("/register")
    public String showForm(Model model) {
        user user = new user();
        model.addAttribute("user", user);
        return "register_form";
    }
}