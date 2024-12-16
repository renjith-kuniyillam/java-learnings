package com.demoThymeleaf.spring_thymeleaf.controllers;

import com.demoThymeleaf.spring_thymeleaf.models.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SelectionExpression {
    @GetMapping("/selection-expression")
    public String selectionExpression(Model model){
        var user = new UserDetails("John Doe", "john.doe@gmail.com", "123 Main St", "123-456-7890", "ADMIN");
        model.addAttribute("user", user);
        return "selection-expression";
    }
}
