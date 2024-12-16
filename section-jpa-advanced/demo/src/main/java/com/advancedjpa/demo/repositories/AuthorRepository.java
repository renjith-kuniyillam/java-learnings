package com.advancedjpa.demo.repositories;

import com.advancedjpa.demo.entity.Author;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.*;

import java.util.List;

public interface AuthorRepository extends JpaRepository<Author, Integer>, JpaSpecificationExecutor<Author> {

    List<Author> findAllByFirstName(String firstName);

    List<Author> findAllByLastNameIgnoreCase(String lastName);

    List<Author> findAllByFirstNameContainingIgnoreCase(String firstName);

    List<Author> findAllByFirstNameStartingWithIgnoreCase(String firstName);

    List<Author> findAllByFirstNameEndingWithIgnoreCase(String firstName);

    List<Author> findAllByFirstNameLikeIgnoreCase(String firstName);




    List<Author> findAllByFirstNameInIgnoreCase(List<String> firstNames);







    //@Query
    @Modifying
    @Query("UPDATE Author a SET a.age = ?1 WHERE a.id = ?2")
    @Transactional
    int updateAuthorAge(int age, int id);

    @Transactional
    @Modifying
    @Query("UPDATE Author a SET a.age = ?1")
    int updateAllAge(int age);

    //@NamedQueries
    List<Author> findByFirstName(String firstName);
    List<Author>  findByAge(int age);

    @Transactional
    @Modifying
    int updateAllAgeNamedQuery(int age);



}
