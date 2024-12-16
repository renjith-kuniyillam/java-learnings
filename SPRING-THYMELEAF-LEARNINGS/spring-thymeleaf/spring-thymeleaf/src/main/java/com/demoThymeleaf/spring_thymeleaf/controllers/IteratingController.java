package com.demoThymeleaf.spring_thymeleaf.controllers;

import com.demoThymeleaf.spring_thymeleaf.models.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.*;

@Controller
public class IteratingController {

    @GetMapping("/iterating")
    public String iterating(Model model) {

        List<UserDetails> users = new ArrayList<>();
        users.add(new UserDetails("John Doe", "asdf", "asdf", "asdf", "asdf"));
        users.add(new UserDetails("Jane Doe", "asdf", "asdf", "asdf", "asdf"));
        users.add(new UserDetails("John Smith", "asdf", "asdf", "asdf", "asdf"));
        users.add(new UserDetails("Jane Smith", "asdf", "asdf", "asdf" , "asdf"));
        model.addAttribute("users", users);

        return "iterating";
    }
}
