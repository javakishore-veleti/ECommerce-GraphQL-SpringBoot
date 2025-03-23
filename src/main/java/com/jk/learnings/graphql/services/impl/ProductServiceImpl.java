package com.jk.learnings.graphql.services.impl;

import com.jk.learnings.graphql.entity.Product;
import com.jk.learnings.graphql.repository.ProductRepository;
import com.jk.learnings.graphql.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public Optional<Product> getProductById(String id) {
        return productRepository.findById(id);
    }

    @Override
    public List<Product> getProducts() {
        // 1. Use the findAll() method to get all products
        Iterable<Product> products = productRepository.findAll();
        List<Product> productList = new ArrayList<>();
        products.forEach(productList::add);
        return productList;
    }

    @Override
    public Product createProduct(Product Product) {
        Product = productRepository.save(Product);
        return Product;
    }

    @Override
    public Product updateProduct(Product product) {
        product = productRepository.save(product);
        return product;
    }

    @Override
    public String deleteProduct(String id) {
        productRepository.deleteById(id);
        return "SUCCESS";
    }
}
