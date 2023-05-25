package phamminhhieu.tuan04_shoppingcart.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import phamminhhieu.tuan04_shoppingcart.model.Product;
import phamminhhieu.tuan04_shoppingcart.repository.ProductRepository;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImp implements ProductService {
    @Autowired
    private ProductRepository productRepository;

    @Override
    public List<Product> getAll() {
        return productRepository.findAll();
    }

    @Override
    public void saveProduct(Product product) {
        productRepository.save(product);
    }

    @Override
    public Product getProductById(int id) {
        Optional<Product> optional = productRepository.findById(id);
        Product product = null;
        if (optional.isPresent()) {
            product = optional.get();
        } else {
            throw new RuntimeException("Product not found for id :: " + id);
        }
        return product;
    }

    @Override
    public void deleteProductById(int id) {
        this.productRepository.deleteById(id);
    }
}
