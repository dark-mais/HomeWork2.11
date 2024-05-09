package com.example.HomeWork21.controller;

import com.example.HomeWork21.model.Busket;
import com.example.HomeWork21.service.ShoppingCartService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/order")


public class ShoppingCartController {
    private final ShoppingCartService shoppingCartService;

    public ShoppingCartController(ShoppingCartService shoppingCartService) {
        this.shoppingCartService = shoppingCartService;
    }

    @GetMapping("/add")
    public List<Integer> addItems(@RequestParam List<Integer> ids) {
        return shoppingCartService.addItems(ids);
    }

    @GetMapping("/get")
    public List<Busket> getItems() {
        return shoppingCartService.getItems();
    }
}
