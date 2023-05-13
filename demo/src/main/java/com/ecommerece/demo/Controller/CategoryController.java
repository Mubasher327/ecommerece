package com.ecommerece.demo.Controller;

import com.ecommerece.demo.Model.Categorymodel;
import com.ecommerece.demo.Service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/category")
public class CategoryController {
    @Autowired
    CategoryService categoryService;
    @PostMapping("/save")
    public Categorymodel addcategory(@RequestBody Categorymodel categorymodel){
        return categoryService.addcategory(categorymodel);
    }
    @GetMapping("/list")
    public List<Categorymodel>categorymodelList(){
        return categoryService.getcategoryList();
    }
    @DeleteMapping("/delete/{id}")
    public String deletecategory(@PathVariable("id") long id){
        return categoryService.deletecategory(id);
    }
}
