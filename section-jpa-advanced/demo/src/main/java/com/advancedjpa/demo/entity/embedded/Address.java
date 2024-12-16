package com.advancedjpa.demo.entity.embedded;


import com.advancedjpa.demo.entity.BaseEntity;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
public class Address {

    private String street;
    private String city;
    private String state;
    private String zipCode;
}
