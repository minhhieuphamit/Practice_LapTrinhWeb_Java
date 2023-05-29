package phamminhhieu.springsecurity_logindb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import phamminhhieu.springsecurity_logindb.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {
}
