package com.chair.ajaxtry.controller;

import com.chair.ajaxtry.model.Product;
import com.chair.ajaxtry.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class ProductController {
    @Autowired
@GetMapping("/api/productByID")
    public List<Product> queryByID(@RequestParam String pcode){

        return ProductService.getProductbyID();
    }
}
