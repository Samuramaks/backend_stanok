package ru.laba.coffeeshop.dao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.laba.coffeeshop.entity.Product;
import ru.laba.coffeeshop.entity.ProductEnum;

import java.util.List;


@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> findByTypeProduct(ProductEnum typeProduct);
}
