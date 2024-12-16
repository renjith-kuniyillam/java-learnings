package com.advancedjpa.demo.mapper;

import com.advancedjpa.demo.dto.AuthorDto;
import com.advancedjpa.demo.entity.Author;

public class AuthorMapper {

    public static AuthorDto toAuthorDto(Author author) {
        return AuthorDto.builder()
                .id(author.getId())
                .firstName(author.getFirstName())
                .lastName(author.getLastName())
                .age(author.getAge())
                .build();
    }

    public static Author toAuthor(AuthorDto authorDto) {
        return Author.builder()
                .id(authorDto.getId())
                .firstName(authorDto.getFirstName())
                .lastName(authorDto.getLastName())
                .age(authorDto.getAge())
                .build();
    }
}
