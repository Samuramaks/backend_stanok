package ru.laba.coffeeshop.service;

import ru.laba.coffeeshop.entity.Product;
import ru.laba.coffeeshop.entity.ProductEnum;

import java.util.List;

public interface ProductServiceI {
    void addProduct(Product product);
    List<Product> getProducts();
    List<Product> getProductByType(ProductEnum productEnum);
    
}
