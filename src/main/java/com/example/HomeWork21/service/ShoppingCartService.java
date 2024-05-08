package com.example.HomeWork21.service;


import com.example.HomeWork21.model.ShoppingCart;

import java.util.List;

public interface ShoppingCartService {
    void add(String id);

    List<ShoppingCart> findAll();
}
