package com.demoThymeleaf.spring_thymeleaf.controllers;

import com.demoThymeleaf.spring_thymeleaf.models.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class IfUnlessController {
    @GetMapping("/if-unless")
    public String ifUnless(Model model) {
        List<UserDetails> users = new ArrayList<>();
        users.add(new UserDetails("John Doe", "asdf", "asdf", "asdf", "ADMIN"));
        users.add(new UserDetails("Jane Doe", "asdf", "asdf", "asdf", "ENGG"));
        users.add(new UserDetails("John Smith", "asdf", "asdf", "asdf", "SUPP"));
        users.add(new UserDetails("Jane Smith", "asdf", "asdf", "asdf" , "ADMIN"));
        model.addAttribute("users", users);

        return "if-unless";
    }

    @GetMapping("/switch-case")
    public String switchCase(Model model) {
        UserDetails users = UserDetails.builder()
                    .name("John Doe")
                    .email("john.doe.gmail.com")
                    .address("123 Main St")
                    .phone("123-456-7890")
                    .role("ADMIN").build();

        model.addAttribute("users", users);

        return "switch-case";
    }
}
