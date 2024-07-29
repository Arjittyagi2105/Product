package com.example.ProductService.Mapper;

import com.example.ProductService.DTO.ProductResponseDTO;
import com.example.ProductService.Entity.Product;

//Mapper classes are used to convert entities to their respective DTOs.
public class ProductEntityDTOMapper {
    public static ProductResponseDTO convertProductEntityToProductResponseDTO(Product product) {
        ProductResponseDTO ResponseDTO = new ProductResponseDTO();
        ResponseDTO.setProductId(product.getId());
        ResponseDTO.setCategory(product.getCategory());
        ResponseDTO.setDescription(product.getDescription());
        ResponseDTO.setTitle(product.getTitle());
        ResponseDTO.setPrice(product.getPrice());
        ResponseDTO.setRating(product.getRating());
        ResponseDTO.setImageURL(product.getImageURL());
        return ResponseDTO;
    }
}
