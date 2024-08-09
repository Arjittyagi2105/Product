package com.example.ProductService.Service;

import com.example.ProductService.Client.FakeStoreClient;
import com.example.ProductService.DTO.FakeStoreProductResponseDTO;
import com.example.ProductService.Entity.Product;
import com.example.ProductService.Exceptions.ProductNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FakeStoreProductService implements ProductService{

    @Autowired
    private FakeStoreClient fakeStoreClient;
    @Override
    public List<FakeStoreProductResponseDTO> getAllProducts() {

         List<FakeStoreProductResponseDTO> fakeStoreProducts = fakeStoreClient.getAllProducts();
         return fakeStoreProducts;

    }

    @Override
    public FakeStoreProductResponseDTO getProduct(int productId) throws ProductNotFoundException {
        FakeStoreProductResponseDTO fakeStoreProductResponseDTO = fakeStoreClient.getProductById(productId);
        if(fakeStoreProductResponseDTO == null) {
            throw new ProductNotFoundException("Product not found with ID: " + productId);
        }
        return fakeStoreProductResponseDTO;
    }

    @Override
    public Product createProduct(Product product) {
        return null;
    }

    @Override
    public Product updateProduct(Product updatedProduct, int productId) {
        return null;
    }

    @Override
    public Boolean deleteProduct(int productId) {
        return null;
    }
}
