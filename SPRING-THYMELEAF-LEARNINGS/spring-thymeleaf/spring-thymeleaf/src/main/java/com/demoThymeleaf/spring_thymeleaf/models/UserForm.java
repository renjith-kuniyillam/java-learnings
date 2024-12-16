package com.demoThymeleaf.spring_thymeleaf.models;

import lombok.Data;

@Data
public class UserForm {
    private String name;
    private String email;
    private String address;
    private String married;
    private String password;
    private String profession;
}
