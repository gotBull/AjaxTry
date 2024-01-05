package com.chair.ajaxtry.service;

import com.chair.ajaxtry.model.Product;
import com.chair.ajaxtry.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    ProductRepository productRepository;
    public static List<Product> getProductbyID(){
        return productRepository.getProductbyID(String id);

    }
}
