package ru.laba.coffeeshop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ru.laba.coffeeshop.dao.repository.ProductRepository;
import ru.laba.coffeeshop.entity.Product;
import ru.laba.coffeeshop.entity.ProductEnum;

@Service
public class ProductServiceImp implements ProductServiceI{


    @Autowired
    ProductRepository productRepository;


    @Override
    public void addProduct(Product product) {
       productRepository.save(product);
    }

    @Override
    public List<Product> getProducts() {
        return productRepository.findAll();
    }

    @Override
    public List<Product> getProductByType(ProductEnum productEnum) {
        return productRepository.findByTypeProduct(productEnum);
    }
    
}
