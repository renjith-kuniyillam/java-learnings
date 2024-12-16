package com.specification.demo.repository;

import com.specification.demo.entity.Student;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Long>, JpaSpecificationExecutor<Student> {
    Student findStudentByNameLike(String name);

    List<Student> findByAddressCity(String city);

    List<Student> findBySubjectName(String name);

    //This method is for pagination demo
    Page<Student> findByAddressCity(String city, Pageable pageable);

}
