package com.advancedjpa.demo.entity.embedded;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "order_tbl")
public class Order {

    @EmbeddedId
    private OrderId orderId;

    @Embedded
    private Address address;

    private String orderDescription;
    private double orderAmount;
}
