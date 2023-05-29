package phamminhhieu.springsecurity_logindb.service;

import phamminhhieu.springsecurity_logindb.model.Product;

import java.util.List;

public interface ProductService {
    List<Product> getAll();

    void saveProduct(Product product);

    Product getProductById(int id);

    void deleteProductById(int id);
}
