package com.specification.demo.service;

import com.specification.demo.dto.StudentRequestDto;
import com.specification.demo.entity.Address;
import com.specification.demo.entity.Student;
import com.specification.demo.entity.Subject;
import com.specification.demo.repository.StudentRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import jakarta.persistence.criteria.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@Service
public class StudentServiceCriteriaQuery {
    private StudentRepository studentRepository;

    EntityManager entityManager;

    public List<Student> getStudents(StudentRequestDto requestDto) {
        CriteriaBuilder cb = entityManager.getCriteriaBuilder();
        CriteriaQuery<Student> query = cb.createQuery(Student.class);

        //SELECT * FROM Student
        Root students = query.from(Student.class);
        // Join with Address table
        Join<Student, Address> addressJoin = students.join("address");
        Join<Student, Subject> subjectJoin = students.join("subject");


        Predicate namePredicate = cb.like(students.get("name"), "%" + requestDto.getName() + "%");
        Predicate cityPredicate = cb.like(addressJoin.get("city"), "%" + requestDto.getCity() + "%");
        Predicate subjectPredicate = cb.like(subjectJoin.get("name"), "%" + requestDto.getSubject() + "%");

        Predicate orPredicate = cb.or(namePredicate, cityPredicate);
        Predicate andPredicate = cb.and(orPredicate, subjectPredicate);

        query.where(andPredicate);


        TypedQuery<Student> typedQuery = entityManager.createQuery(query);
        return typedQuery.getResultList();
    }


    public List<Student> getStudentsWithOptions(StudentRequestDto requestDto) {
        CriteriaBuilder cb = entityManager.getCriteriaBuilder();
        CriteriaQuery<Student> query = cb.createQuery(Student.class);

        //SELECT * FROM Student
        Root students = query.from(Student.class);
        // Join with Address table
        Join<Student, Address> addressJoin = students.join("address");
        Join<Student, Subject> subjectJoin = students.join("subject");
        List<Predicate> predicates = new ArrayList<>();

        if(requestDto.getName() != null) {
            Predicate namePredicate = cb.like(students.get("name"), "%" + requestDto.getName() + "%");
            predicates.add(namePredicate);
        }
        if(requestDto.getCity() != null) {
            Predicate cityPredicate = cb.like(addressJoin.get("city"), "%" + requestDto.getCity() + "%");
            predicates.add(cityPredicate);
        }
        if (requestDto.getSubject() != null) {
            Predicate subjectPredicate = cb.like(subjectJoin.get("name"), "%" + requestDto.getSubject() + "%");
            predicates.add(subjectPredicate);
        }
        Predicate orPredicate = cb.or(predicates.toArray(new Predicate[0]));
        if(requestDto.getSubject() != null) {
            Predicate subjectPredicate = cb.like(subjectJoin.get("name"), "%" + requestDto.getSubject() + "%");
            query.where(cb.and(orPredicate, subjectPredicate));
        } else {
            query.where(orPredicate);
        }

        TypedQuery<Student> typedQuery = entityManager.createQuery(query);
        return typedQuery.getResultList();
    }



}
