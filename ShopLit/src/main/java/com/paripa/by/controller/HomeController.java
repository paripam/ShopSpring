package com.paripa.by.controller;

import com.paripa.by.model.ShoppingCart;
import com.paripa.by.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class HomeController {

    private CartService cartService;

    @Autowired
    public HomeController(CartService cartService) {
        this.cartService = cartService;
    }

    @RequestMapping("/")
    public String home(Model model) {
        ShoppingCart shoppingCart = cartService.getShoppingCart();
        model.addAttribute(shoppingCart);
        return "home";
    }
}
