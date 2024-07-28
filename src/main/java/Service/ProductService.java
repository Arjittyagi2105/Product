package Service;

import DTO.FakeStoreProductResponseDTO;
import Entity.Product;

import java.util.List;

//To follow Dependency inversion principle, we create an interface of service first instead of class.
public interface ProductService {
    List<FakeStoreProductResponseDTO> getAllProducts();
    Product getProduct(int productId);
    Product createProduct(Product product);
    Product updateProduct(Product updatedProduct,int productId);
    Boolean deleteProduct(int productId);
}
