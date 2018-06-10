package com.paripa.by.service;

import com.paripa.by.model.ShoppingCart;


public interface CartService {

    ShoppingCart getShoppingCart();

    void addProductById(int id);

    void clearCart();

    void removeCartItemByProductId(int id);

}
