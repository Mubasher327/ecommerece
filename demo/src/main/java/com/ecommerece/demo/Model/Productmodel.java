package com.ecommerece.demo.Model;

import com.ecommerece.demo.Entity.Product;
import jakarta.persistence.Column;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@Data
@NoArgsConstructor
public class Productmodel {
    private long id;
    private String productName;
    private double price;
    private double weight;
    private String imageName;
    private String description;

    public Productmodel(Product product){
        this.setId(product.getId());
        this.setProductName(product.getProductName());
        this.setPrice(product.getPrice());
        this.setWeight(product.getWeight());
        this.setImageName(product.getImageName());
        this.setDescription(product.getDescription());

    }

    public Product dissamble(){
        Product product=new Product();
        product.setId(id);
        product.setProductName(productName);
        product.setPrice(price);
        product.setWeight(weight);
        product.setImageName(imageName);
        product.setDescription(description);

        return product;
    }
}
