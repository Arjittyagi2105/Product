package Mapper;

import DTO.ProductResponseDTO;
import Entity.Product;

import java.util.List;

//Mapper classes are used to convert entities to their respective DTOs.
public class ProductEntityDTOMapper {
    public static ProductResponseDTO convertProductEntityToProductResponseDTO(Product product) {
        ProductResponseDTO ResponseDTO = new ProductResponseDTO();
        ResponseDTO.setProductId(product.getProductId());
        ResponseDTO.setCategory(product.getCategory());
        ResponseDTO.setDescription(product.getDescription());
        ResponseDTO.setTitle(product.getTitle());
        ResponseDTO.setPrice(product.getPrice());
        ResponseDTO.setRating(product.getRating());
        ResponseDTO.setImageURL(product.getImageURL());
        return ResponseDTO;
    }
}
