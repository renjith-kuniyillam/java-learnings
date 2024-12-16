package com.demoThymeleaf.spring_thymeleaf.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class linkExpression {
    @GetMapping("/link-expression")
    public String linkExpression(Model model) {
        var id = 12;

        model.addAttribute("id", id);
        return "link-expression";
    }
}
