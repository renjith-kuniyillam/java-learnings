package com.firstspring.spring_boot_api.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Courses {
    private long id;
    private String title;
    private String description;
    private int rating;


}
