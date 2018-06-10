package com.paripa.by.controller;

import com.paripa.by.model.ShoppingCart;
import com.paripa.by.model.Product;
import com.paripa.by.service.CartService;
import com.paripa.by.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;


@Controller
public class CatalogController {

    private ProductService productService;
    private CartService cartService;

    @Autowired
    public CatalogController(ProductService productService, CartService cartService) {
        this.productService = productService;
        this.cartService = cartService;
    }

    @RequestMapping("/catalog")
    public String getProducts(Model model) {
        List<Product> products = productService.getProducts();
        ShoppingCart shoppingCart = cartService.getShoppingCart();
        model.addAttribute("products", products);
        model.addAttribute(shoppingCart);
        return "catalog";
    }



}
