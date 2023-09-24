package com.example.productservice.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products/categories")
public class CategoryController {


    @GetMapping()
    public String getAllCategories(){

        return "All categories";
    }

    @GetMapping("/{categoryName}")
    public String getProductInCategory(@PathVariable String categoryName){

        return "Product from " + categoryName;
    }
}
