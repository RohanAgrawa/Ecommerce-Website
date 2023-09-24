package com.example.productservice.dtos;

import com.example.productservice.models.Category;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class ProductRequestDTO {

    private String title;
    private String description;
    private String imageUrl;
    private double price;
    private Category category;
}
