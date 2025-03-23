package com.jk.learnings.graphql.services;

import com.jk.learnings.graphql.entity.Product;

import java.util.List;
import java.util.Optional;

public interface ProductService {
    Optional<Product> getProductById(String id);
    List<Product> getProducts();
    Product createProduct(Product Product);
    Product updateProduct(Product Product);
    String deleteProduct(String id);
}
