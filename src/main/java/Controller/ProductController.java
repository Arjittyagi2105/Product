package Controller;


import DTO.FakeStoreProductResponseDTO;
import Entity.Product;
import Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@CrossOrigin
public class ProductController {

    @Autowired
    ProductService productService;      //Field injection using springboot

    @GetMapping("/product")
    public ResponseEntity getAllProducts() {
        List<FakeStoreProductResponseDTO> products = productService.getAllProducts(); //Calling service through controller
        //Now after getting products list, this list will contain many attributes that are not needed
        //in http response for front end and hence we create a separate dto object to store
        //only the attributes required for front end and wrap that in the response entity,
        return ResponseEntity.ok(products);
    }
    @GetMapping("/")
    public String home() {
        return "Hello World!";
    }
}
