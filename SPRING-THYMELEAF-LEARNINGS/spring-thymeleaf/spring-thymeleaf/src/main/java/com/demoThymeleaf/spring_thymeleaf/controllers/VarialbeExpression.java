package com.demoThymeleaf.spring_thymeleaf.controllers;

import com.demoThymeleaf.spring_thymeleaf.models.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class VarialbeExpression {

    @GetMapping("/variable-expression")
    public String demoVariable(Model model){
        var user = new UserDetails("John Doe", "john.doe@gmail.com", "123 Main St", "123-456-7890", "123-456-7890");
        model.addAttribute("user", user);
        return "variable-expression";
    }
}
