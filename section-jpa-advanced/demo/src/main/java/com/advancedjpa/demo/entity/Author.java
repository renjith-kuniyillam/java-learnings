package com.advancedjpa.demo.entity;


import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.databind.ser.Serializers;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.time.LocalDateTime;
import java.util.List;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@EqualsAndHashCode(callSuper = true)
@Table(name = "AUTHOR_TBL")
@NamedQuery(name = "Author.findByFirstName", query = "SELECT a FROM Author a WHERE a.firstName = ?1")
@NamedQueries({
        @NamedQuery(name = "Author.findByLastName", query = "SELECT a FROM Author a WHERE a.lastName = ?1"),
        @NamedQuery(name = "Author.findByEmail", query = "SELECT a FROM Author a WHERE a.email = ?1"),
        @NamedQuery(name = "Author.findByAge", query = "SELECT a FROM Author a WHERE a.age = ?1"),
        @NamedQuery(name = "Author.findAll", query = "SELECT a FROM Author a"),
        @NamedQuery(name="Author.updateAllAgeNamedQuery", query = "UPDATE Author a SET a.age = ?1"),
})
public class Author extends BaseEntity {


    @Column(name = "f_name", length = 35)
    private String firstName;

    @Column(name = "l_name", length = 35)
    private String lastName;

    @Column(unique = true, nullable = false)
    private String email;

    private int age;

    @ManyToMany(mappedBy = "authors",fetch = FetchType.EAGER, cascade = CascadeType.MERGE)
    private List<Course> courses;

}
