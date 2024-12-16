package com.demoThymeleaf.spring_thymeleaf.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MessageExpression {
    @GetMapping("/message-expression")
    public String messageExpression(Model model) {
        return "message-expression";
    }
}
