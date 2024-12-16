package com.demoThymeleaf.spring_thymeleaf.controllers;

import com.demoThymeleaf.spring_thymeleaf.models.UserForm;
import org.springframework.boot.Banner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class UserRegistration {
    @GetMapping("/user-registration")
    public String userRegistration(Model model) {
        UserForm userForm = new UserForm();

        List<String> professionList = List.of("Developer", "Designer", "Tester", "Manager");

        model.addAttribute("userForm", userForm);
        model.addAttribute("professionList", professionList);

        return "user-registration";
    }

    @PostMapping("register/user")
    public String userRegistrationPost(Model model,  @ModelAttribute UserForm userForm) {
        model.addAttribute("userForm", userForm);

        return "user-registration-success";
    }
}
