package com.example.homework2.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;


@Entity
@Table
@Getter
@Setter
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long productId;
    private String productCode;
    private String productName;
    private double productPrice;

    @ManyToOne
    @JoinColumn(name="company_id", nullable=false)
    private Company company;
}
