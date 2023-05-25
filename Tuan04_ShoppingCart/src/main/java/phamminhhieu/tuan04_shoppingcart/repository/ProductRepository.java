package phamminhhieu.tuan04_shoppingcart.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import phamminhhieu.tuan04_shoppingcart.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {
}
