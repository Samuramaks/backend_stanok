package ru.laba.coffeeshop.dto;

import lombok.Data;
import ru.laba.coffeeshop.entity.ProductEnum;
import ru.laba.coffeeshop.entity.Product;



@Data
public class ProductDTO {
    private long id;
    private String productName;
    private ProductEnum typeProduct;
    private String imageUrl; 

     public static ProductDTO from(Product product){
        ProductDTO productDTO = new ProductDTO();
        productDTO.setId(product.getId());
        productDTO.setProductName(product.getProductName());
        productDTO.setTypeProduct(product.getTypeProduct());
        productDTO.setImageUrl(product.getImageUrl());

        return productDTO;
    }

    public Product topProduct(){
        Product product = new Product();
        product.setId(this.id);
        product.setProductName(this.productName);
        product.setTypeProduct(this.typeProduct);
        product.setImageUrl(this.imageUrl);

        return product;

    }
    
}
