package com.example.productservice.controllers;

import com.example.productservice.dtos.ProductRequestDTO;
import lombok.Getter;
import lombok.Setter;
import org.springframework.web.bind.annotation.*;

@Getter
@Setter
@RestController
@RequestMapping("/products")
public class ProductController {

    @GetMapping()
    public String getAllProducts(){

        return "All products";
    }

    @GetMapping("/{productId}")
    public String getSingleProduct(@PathVariable long productId){

        return "Single product" + productId;
    }

    @PostMapping()
    public String addProduct(@RequestBody ProductRequestDTO productRequestDTO){

        return "product added" + productRequestDTO;
    }

    @PutMapping("/{productId}")
    public String updateProduct(@PathVariable long productId, @RequestBody ProductRequestDTO productRequestDTO){

        return "product updated";
    }

    @DeleteMapping("/{productId}")
    public String deleteProduct(@PathVariable long productId){
        return "productDeleted";
    }
}
