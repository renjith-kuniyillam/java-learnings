package com.advancedjpa.demo.services;

import com.advancedjpa.demo.dto.AuthorDto;
import com.advancedjpa.demo.entity.Author;
import com.advancedjpa.demo.mapper.AuthorMapper;
import com.advancedjpa.demo.repositories.AuthorRepository;
import com.advancedjpa.demo.sepecification.AuthorSpecification;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
@Data
public class AuthorService {
    private final AuthorRepository authorRepository;

    public List<Author> getAuthorsStartsWith(String startsWith) {
        return  authorRepository.findAllByFirstNameStartingWithIgnoreCase(startsWith);
    }

    public List<Author> getAuthorsContains(String contains) {
        return  authorRepository.findAllByFirstNameContainingIgnoreCase(contains);
    }

    public List<AuthorDto> getAuthorByFirstName(String firstName) {
        List<AuthorDto> authorList = authorRepository.findByFirstName(firstName)
                .stream()
                .map(author -> AuthorMapper.toAuthorDto(author))
                .toList();

        return  authorList;
    }

    public int updateAllAgeNamedQuery(int age) {
        return authorRepository.updateAllAgeNamedQuery(age);
    }

    @Transactional(readOnly = true)
    public List<Author> getAuthorsByAgeAndFirstName(int age, String firstNamePrefix) {
        Specification<Author> spec = Specification
                .where(AuthorSpecification.hasAge(age))
                .and(AuthorSpecification.hasFirstNameContains(firstNamePrefix))
                .and(AuthorSpecification.fetchCourses());
        return authorRepository.findAll(spec);
    }


}
