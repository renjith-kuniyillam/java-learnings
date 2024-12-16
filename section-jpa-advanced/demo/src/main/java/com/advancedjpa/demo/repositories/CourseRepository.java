package com.advancedjpa.demo.repositories;

import com.advancedjpa.demo.entity.Author;
import com.advancedjpa.demo.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface CourseRepository extends JpaRepository<Course, Integer>, JpaSpecificationExecutor<Course> {
}
