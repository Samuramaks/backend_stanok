package ru.laba.coffeeshop.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ru.laba.coffeeshop.dto.ProductDTO;
import ru.laba.coffeeshop.entity.ProductEnum;
import ru.laba.coffeeshop.service.ProductServiceI;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.stream.Collectors;


@RestController
@RequestMapping("/product")
public class ControllerProduct {
    @Autowired
    ProductServiceI productService;


    @GetMapping("/all")
    public List<ProductDTO> getAllProduct() {
        return productService.getProducts().stream()
        .map(ProductDTO::from)
        .collect(Collectors.toList());
    }

    @GetMapping("/find/type")
    public List<ProductDTO> getProductByType(@RequestParam ProductEnum productEnum) {
        return productService.getProductByType(productEnum).stream()
        .map(ProductDTO::from)
        .collect(Collectors.toList());
    }


    
    
    
}
