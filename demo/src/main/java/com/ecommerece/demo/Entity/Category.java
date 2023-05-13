package com.ecommerece.demo.Entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
@Table(name="category")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="category_id")
    private long id;
    @Column (name= "category_name")
    private String name;

    @Column(name="description")
    private String description;

    @OneToMany(mappedBy = "category")
    private List<Product> productList;

}

