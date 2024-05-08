package com.example.HomeWork21.controller;

import com.example.HomeWork21.model.ShoppingCart;
import com.example.HomeWork21.service.ShoppingCartService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/order")
@RequiredArgsConstructor

public class ShoppingCartController {
    private final ShoppingCartService shoppingCartService;

    @GetMapping("/add")
    public void add(@RequestParam String id) {
        shoppingCartService.add(id);
    }

    @GetMapping("/get")
    public List<ShoppingCart> findAll() {
        return shoppingCartService.findAll();
    }
}
