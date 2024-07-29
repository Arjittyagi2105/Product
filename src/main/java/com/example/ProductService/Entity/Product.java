package com.example.ProductService.Entity;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "ECOM_PRODUCT")
public class Product extends BaseModel{
    private String title;
    private double price;
    private String description;
    private String category;
    private String imageURL;
    private double rating;
}
