package com.demoThymeleaf.spring_thymeleaf.controllers;

import org.springframework.boot.Banner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FragmentDemo {
    // This controller is used to demonstrate the use of fragments in Thymeleaf
    @GetMapping("/fragment-demo")
    public String fragmentDemo(Model model) {
        return "fragment-demo";
    }
}
