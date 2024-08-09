package com.example.ProductService.Service;

import com.example.ProductService.DTO.FakeStoreProductResponseDTO;
import com.example.ProductService.Entity.Product;
import com.example.ProductService.Exceptions.ProductNotFoundException;

import java.util.List;

//To follow Dependency inversion principle, we create an interface of service first instead of class.
public interface ProductService {
    List<FakeStoreProductResponseDTO> getAllProducts();
    FakeStoreProductResponseDTO getProduct(int productId) throws ProductNotFoundException;
    Product createProduct(Product product);
    Product updateProduct(Product updatedProduct,int productId);
    Boolean deleteProduct(int productId);
}
