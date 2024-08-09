package com.example.ProductService.Exceptions;

import com.example.ProductService.DTO.ExceptionResponseDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ProductServiceExceptionHandler {
    @ExceptionHandler(ProductNotFoundException.class)   //this annotation tells
    // which class to refer to when a given scenario occurs (in this case, when product is not found)
    //.class means refer to an exception in this class
    public ResponseEntity handleProductNotFoundException(ProductNotFoundException pe) {
        ExceptionResponseDTO exceptionResponseDTO = new ExceptionResponseDTO(pe.getMessage(),404);
        // declared a DTO object which gets the message from referring exception class (and 404 is standard code for not found)
        return new ResponseEntity<>(exceptionResponseDTO, HttpStatus.NOT_FOUND);
        //created a response entity object using new and gave values of response and status.
    }
}
