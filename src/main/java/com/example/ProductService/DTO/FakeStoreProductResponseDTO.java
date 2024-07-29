package com.example.ProductService.DTO;

//DTO for returning to client class
//here the names of the attributes should be exactly the same as coming from third party system
//in order to avoid any extra annotations

import lombok.Getter;
import lombok.Setter;

//Serialization: process of converting an object to json string
//Desrialization: process of converting json string to an object

@Getter
@Setter
public class FakeStoreProductResponseDTO {
    private int id;
    private String title;
    private double price;
    private String description;
    private String category;
    private String image;
    private FakeStoreProductRatingDTO rating;

}




/* Fake Store API response
    {
            "id": 1,
            "title": "Fjallraven - Foldsack No. 1 Backpack, Fits 15 Laptops",
            "price": 109.95,
            "description": "Your perfect pack for everyday use and walks in the forest. Stash your laptop (up to 15 inches) in the padded sleeve, your everyday",
            "category": "men's clothing",
            "image": "https://fakestoreapi.com/img/81fPKd-2AYL._AC_SL1500_.jpg",
            "rating": {
            "rate": 3.9,
            "count": 120
            }

 */