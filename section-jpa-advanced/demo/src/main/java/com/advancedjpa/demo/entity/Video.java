package com.advancedjpa.demo.entity;


import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.hibernate.annotations.Polymorphism;
import org.hibernate.annotations.PolymorphismType;

@Data
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@Entity
@Polymorphism(type = PolymorphismType.EXPLICIT)
//@PrimaryKeyJoinColumn(name = "resource_id") --> This is for Join Table Strategy
//@DiscriminatorValue("V") --> This is for Single Table Strategy
public class Video extends Resource {
    private int length;
}
