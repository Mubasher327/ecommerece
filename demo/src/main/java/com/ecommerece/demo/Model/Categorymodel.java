package com.ecommerece.demo.Model;

import com.ecommerece.demo.Entity.Category;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;
@Component
@Data
@NoArgsConstructor
public class Categorymodel {
    private long id;
    private String name;
    private String description;



   public Categorymodel(Category category){
    this.setId(category.getId());
    this.setName(category.getName());
    this.setDescription(category.getDescription());

   }

   public Category dissamble(){
       Category category=new Category();
       category.setId(id);
       category.setName(name);
       category.setDescription(description);
       return category;
   }

}
