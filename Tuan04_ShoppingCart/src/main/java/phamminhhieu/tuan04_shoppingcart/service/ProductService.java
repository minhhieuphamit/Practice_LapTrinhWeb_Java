package phamminhhieu.tuan04_shoppingcart.service;

import phamminhhieu.tuan04_shoppingcart.model.Product;

import java.util.List;

public interface ProductService {
    List<Product> getAll();

    void saveProduct(Product product);

    Product getProductById(int id);

    void deleteProductById(int id);
}
