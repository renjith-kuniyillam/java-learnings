package com.firstspring.spring_boot_api.contollers;


import com.firstspring.spring_boot_api.models.Courses;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CoursesController {

    @GetMapping("/courses")
    public List<Courses> getCourses() {
        return List.of(
            new Courses(1, "Java", "Java Programming", 5),
            new Courses(2, "Python", "Python Programming", 4),
            new Courses(3, "JavaScript", "JavaScript Programming", 3),
            new Courses(5, "Angular", "JavaScript Programming", 3),
            new Courses(6, "React", "JavaScript Programming", 3)
        );
    }

    @GetMapping("/courses/1")
    public Courses getCourseById() {
        return new Courses(1, "Java", "Java Programming", 5);
    }
}
