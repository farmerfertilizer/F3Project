package com.cart.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cart.entity.Cart;
import com.cart.repository.CartRepository;

@RestController
@RequestMapping("/cart")
public class CartController {

    @Autowired
    private CartRepository cartRepository;

    @PostMapping("/addToCart")
    public Cart saveCart(@RequestBody Cart cart) {
        return cartRepository.save(cart);
    }

}
