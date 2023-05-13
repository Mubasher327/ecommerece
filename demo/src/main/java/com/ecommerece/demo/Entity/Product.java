package com.ecommerece.demo.Entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name="product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="product_id")
    private long id;
    @Column(name="product_name")
    private String productName;
    @Column(name="price")
    private double price;
    @Column(name="weight")
    private double weight;
    @Column(name="image_name")
    private String imageName;
    @Column(name="description")
    private String description;


    @ManyToOne
    @JoinColumn(name="category_id")
    private Category category;
}
