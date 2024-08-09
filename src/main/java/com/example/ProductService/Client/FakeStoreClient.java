package com.example.ProductService.Client;

import com.example.ProductService.DTO.FakeStoreProductResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.client.RestTemplate;

import java.util.List;

//Client class is the class that the service class calls to interact with third party APIs
//in this case we are going to use fake store as our third party and hence we are going to create
//client class for the same, here resttemplate builder will help us with the task of making API calls.
@Component
public class FakeStoreClient {
    @Autowired
    private RestTemplateBuilder restTemplateBuilder;
    @Value("${fakestore.api.base.URL}") //this annotation will fetch the value from Application Properties and will give it to this variable
    private String fakeStoreAPIBaseUrl;
    @Value("${fakestore.api.product.path}")
    private String fakeStoreAPIProductPath;


    //Now we are writing the following method to return all the products, but here instead
    //of returning list of products we will make a DTO of the response that we are getting from
    //third party to keep things loosely coupled, as in future we might have to change this third party,
    //and if we return list of products then it will lead to schema change which will impact the whole
    //codebase, but by making a DTO the change will impact only the client class.
    public List<FakeStoreProductResponseDTO> getAllProducts() {
        String fakeStoreGetAllProductURL = fakeStoreAPIBaseUrl.concat(fakeStoreAPIProductPath); //first get the complete path
        RestTemplate restTemplate = restTemplateBuilder.build();  //builder method for creating resttemplate object
        ResponseEntity<FakeStoreProductResponseDTO[]> productResponseList =
                restTemplate.getForEntity(fakeStoreGetAllProductURL, FakeStoreProductResponseDTO[].class);
        return List.of(productResponseList.getBody());
    }

    public FakeStoreProductResponseDTO getProductById(int id) {
        //url would be: https://fakestoreapi.com/products/id
        String fakeStoreGetProductURL = fakeStoreAPIBaseUrl.concat(fakeStoreAPIProductPath).concat("/" + id);
        RestTemplate restTemplate = restTemplateBuilder.build();
        ResponseEntity<FakeStoreProductResponseDTO> productResponse = restTemplate.getForEntity(fakeStoreGetProductURL, FakeStoreProductResponseDTO.class);
        return productResponse.getBody();
    }
}

/*
restTemplate.getForEntity(fakeStoreGetAllProductURL, FakeStoreProductResponseDTO[].class);
restTemplate.getForEntity(URL for API, Object in which you want the response to be stored);
 */