package com.example.HomeWork21.service;


import java.util.List;

public interface ShoppingCartService {
    List<Integer> addItems(List<Integer> ids);

    List<Integer> getItems();
}
