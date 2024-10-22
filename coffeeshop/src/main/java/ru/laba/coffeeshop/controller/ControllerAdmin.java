package ru.laba.coffeeshop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import ru.laba.coffeeshop.dto.ProductDTO;
import ru.laba.coffeeshop.service.ProductServiceI;

@RestController
public class ControllerAdmin {
    @Autowired
    ProductServiceI productService;

    @PostMapping("/add")
    public ResponseEntity<ProductDTO> addProduct(@RequestBody ProductDTO productDTO) {
        productService.addProduct(productDTO.topProduct());
        
        return ResponseEntity.ok().build();
    }
}
