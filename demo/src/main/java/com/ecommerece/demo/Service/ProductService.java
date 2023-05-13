package com.ecommerece.demo.Service;

import com.ecommerece.demo.Model.Productmodel;
import com.ecommerece.demo.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;
    @Autowired
    CategoryService categoryService;

    public Productmodel addProduct(Productmodel productmodel){
        return new Productmodel(productRepository.save(productmodel.dissamble()));
    }

}
