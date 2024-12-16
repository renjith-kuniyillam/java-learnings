package com.advancedjpa.demo.controllers;

import com.advancedjpa.demo.dto.AuthorDto;
import com.advancedjpa.demo.services.AuthorService;
import lombok.AllArgsConstructor;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class AuthorController {

    private final AuthorService authorService;

    @GetMapping("/authors")
    public ResponseEntity<Object> getAuthorsStartsWith(@RequestParam String startsWith) {

        return ResponseEntity.ok(authorService.getAuthorsStartsWith(startsWith));
    }

    @GetMapping("/authorsContains")
    public ResponseEntity<Object> getAuthorsContains(@RequestParam String contains) {
        return ResponseEntity.ok(authorService.getAuthorsContains(contains));
    }

    @GetMapping("/authorsFindByFirstName")
    public ResponseEntity<List<AuthorDto>> getAuthorByFirstName(@RequestParam String firstName) {
        return ResponseEntity.ok(authorService.getAuthorByFirstName(firstName));
    }

    @GetMapping("/updateAllAgeNamedQuery")
    public ResponseEntity<Integer> updateAllAgeNamedQuery(@RequestParam int age) {

        return ResponseEntity.ok(authorService.updateAllAgeNamedQuery(age));
    }

}
