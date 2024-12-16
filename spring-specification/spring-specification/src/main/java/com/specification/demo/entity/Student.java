package com.specification.demo.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "student_tbl")
@SuperBuilder
public class Student {
    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name", unique = true)
    private String name;

    @OneToOne(mappedBy = "student",fetch=FetchType.LAZY, cascade = CascadeType.MERGE)
    private Address address;


    @OneToMany(mappedBy = "student", fetch = FetchType.LAZY, cascade = CascadeType.MERGE)
    @JsonBackReference
    private Set<Subject> subject;



}
