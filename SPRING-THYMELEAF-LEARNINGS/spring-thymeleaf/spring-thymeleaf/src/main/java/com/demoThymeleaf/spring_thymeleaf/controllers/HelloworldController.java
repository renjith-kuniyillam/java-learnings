package com.demoThymeleaf.spring_thymeleaf.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloworldController {

    @GetMapping("/hello-world")
    public String helloWorld(Model model){
        model.addAttribute("message", "Hello World");
        return "hello-world";
    }

    public String selectionExpression(Model model){
        model.addAttribute("message", "Hello World");
        model.addAttribute("condition", true);
        return "selection-expression";
    }
}
