package com.example.HomeWork21.service;

import org.springframework.stereotype.Service;
import com.example.HomeWork21.model.ShoppingCart;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
@SessionScope

public class ShoppingCartServiceImpl implements ShoppingCartService {
    List<ShoppingCart> items = new ArrayList<>();

    @Override
    public void add(String ids) {
        List<Integer> listIs = Arrays.stream(ids.split(","))
                .map(Integer::parseInt).toList();
        listIs.forEach(i -> items.add(new ShoppingCart("Товар №%d".formatted(i), i * 4, i)));
    }

    @Override
    public List<ShoppingCart> findAll() {
        return items;
    }
}
