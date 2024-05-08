package com.example.HomeWork21.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;


@Data
@AllArgsConstructor
public class ShoppingCart {
    private String name;
    private Integer price;
    private Integer id;
}
