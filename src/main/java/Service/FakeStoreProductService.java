package Service;

import Client.FakeStoreClient;
import DTO.FakeStoreProductResponseDTO;
import Entity.Product;
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
    public Product getProduct(int productId) {
        return null;
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
