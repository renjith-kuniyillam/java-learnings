package com.advancedjpa.demo.entity;


import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.hibernate.annotations.Polymorphism;

@Data
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@Entity
@Polymorphism(type = org.hibernate.annotations.PolymorphismType.EXPLICIT)
//@PrimaryKeyJoinColumn(name = "resource_id") --> This is for Join Table Strategy
//@DiscriminatorValue("F") --> This is for Single Table Strategy
public class File extends Resource {
    private String type;
}
