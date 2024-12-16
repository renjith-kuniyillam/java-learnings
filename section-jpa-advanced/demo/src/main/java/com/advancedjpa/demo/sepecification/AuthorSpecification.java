package com.advancedjpa.demo.sepecification;

import com.advancedjpa.demo.entity.Author;
import jakarta.persistence.criteria.JoinType;
import org.springframework.data.jpa.domain.Specification;

public class AuthorSpecification {

    public static Specification<Author> hasAge(int age) {
        return (root, query, criteriaBuilder) -> criteriaBuilder.equal(root.get("age"), age);
    }

    public static Specification<Author> hasFirstNameContains(String firstName) {
        return (root, query, criteriaBuilder) ->
                criteriaBuilder
                .like(root.get("firstName"), "%" + firstName + "%");
    }

    public static Specification<Author> fetchCourses() {
        return (root, query, criteriaBuilder) -> {
            root.fetch("courses", JoinType.LEFT);
            query.distinct(true); // Avoid duplicate results due to join
            return criteriaBuilder.conjunction();
        };
    }
}
