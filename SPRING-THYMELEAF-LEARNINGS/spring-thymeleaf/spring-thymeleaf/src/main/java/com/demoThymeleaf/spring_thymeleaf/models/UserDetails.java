package com.demoThymeleaf.spring_thymeleaf.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserDetails {
    private String name;
    private String email;
    private String address;
    private String phone;
    private String role;
}
