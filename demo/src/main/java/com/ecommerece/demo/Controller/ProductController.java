package com.ecommerece.demo.Controller;

import com.ecommerece.demo.Model.Productmodel;
import com.ecommerece.demo.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.AccessType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
public class ProductController {
    @Autowired
    ProductService productService;
    @PostMapping("/save")
    public Productmodel addProduct(@RequestBody Productmodel productmodel){
        return productService.addProduct(productmodel);
    }
}
