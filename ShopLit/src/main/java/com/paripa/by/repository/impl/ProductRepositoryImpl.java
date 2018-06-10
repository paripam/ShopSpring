package com.paripa.by.repository.impl;

import com.paripa.by.model.Product;
import com.paripa.by.repository.ProductRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;


@Repository
@Transactional
public class ProductRepositoryImpl implements ProductRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Product> getProducts() {
        return entityManager.createQuery("from Product", Product.class).getResultList();
    }

    @Override
    public Product getProductById(int id) {
        return entityManager.find(Product.class, id);
    }

    @Override
    public void updateProduct(Product product) {
        entityManager.merge(product);
    }

    @Override
    public void addProduct(Product product) {
        entityManager.persist(product);
    }

    @Override
    public void removeProduct(Product product) {
        entityManager.remove(product);
    }
}
