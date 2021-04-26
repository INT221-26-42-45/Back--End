package com.example.int221.Controllers;

import com.example.int221.Models.ColorOfProduct;
import com.example.int221.Models.Products;
import com.example.int221.Repositories.ColorOfProductJpaRepository;
import com.example.int221.Repositories.ProductJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.print.attribute.standard.MediaSize;
import java.util.List;


@RestController
public class ProductRestController {
    @Autowired
    ColorOfProductJpaRepository colorOfProductJpaRepository;
    @Autowired
    ProductJpaRepository productJpaRepository;

    @GetMapping("/product")
    public List<ColorOfProduct> allProducts(){
        return colorOfProductJpaRepository.findAll();
    }

    @GetMapping("/product/{productId}")
    public Products showProduct(@PathVariable String productId){
        return productJpaRepository.findById(productId.toUpperCase()).orElse(null);
    }




}
