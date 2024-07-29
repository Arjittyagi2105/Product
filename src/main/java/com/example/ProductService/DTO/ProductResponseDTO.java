package com.example.ProductService.DTO;

import lombok.Getter;
import lombok.Setter;

import java.util.SplittableRandom;
import java.util.UUID;

//DTO: Data transfer Object
// We give only the attributes needed to be sent as a response of our API
@Getter
@Setter
public class ProductResponseDTO {
    private int productId;
    private String title;
    private double price;
    private String description;
    private String category;
    private String imageURL;
    private double rating;

}
//Now to convert DTO to Product entity or vice versa,
// we use something called as mapper class
