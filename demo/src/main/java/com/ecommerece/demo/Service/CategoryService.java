package com.ecommerece.demo.Service;

import com.ecommerece.demo.Entity.Category;
import com.ecommerece.demo.Model.Categorymodel;
import com.ecommerece.demo.Repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CategoryService {
@Autowired
    private CategoryRepository categoryRepository;

public Categorymodel addcategory(Categorymodel categorymodel){
    return new Categorymodel(categoryRepository.save(categorymodel.dissamble()));
}

public Category getcategoryByid(long id){
    return categoryRepository.findById(id).get();
}
public List<Categorymodel> getcategoryList(){
 return categoryRepository.findAll().stream().map(Categorymodel::new).collect(Collectors.toList());
}
public String deletecategory(long id){
     categoryRepository.deleteById(id);
     return "Category deleted Successfully";
}


}
