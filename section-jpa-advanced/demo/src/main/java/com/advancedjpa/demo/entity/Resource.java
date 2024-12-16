package com.advancedjpa.demo.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)

//@DiscriminatorColumn(name = "resource_type") --> This is for Single Table Strategy
public class Resource{
    @Id
    @GeneratedValue
    private Integer id;

    private String name;

    private String url;

    private int size;

    @OneToOne
    @JoinColumn(name = "lecture_id")
    private Lecture lecture;
}
