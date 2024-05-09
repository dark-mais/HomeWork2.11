package com.example.HomeWork21.service;

import com.example.HomeWork21.model.Busket;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

import java.util.List;

@Service
public class ShoppingCartServiceImpl implements ShoppingCartService {

    private final Busket busket;

    public ShoppingCartServiceImpl(Busket busket) {
        this.busket = busket;
    }

    @Override
    public List<Integer> addItems(List<Integer> ids) {
        return busket.addItems(ids);
    }

    @Override
    public List<Integer> getItems() {
        return busket.getItems();
    }
}
