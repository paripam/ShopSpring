package com.paripa.by.repository;

import com.paripa.by.model.Product;
import java.util.List;


public interface ProductRepository {

    List<Product> getProducts();

    Product getProductById(int id);

    void updateProduct(Product product);

    void addProduct(Product product);

    void removeProduct(Product product);

}
