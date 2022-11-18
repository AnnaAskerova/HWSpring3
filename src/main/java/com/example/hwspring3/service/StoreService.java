package com.example.hwspring3.service;

import com.example.hwspring3.model.Item;
import com.example.hwspring3.repository.Basket;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;

@Service
public class StoreService {
    private final Basket basket;

    public StoreService(Basket basket) {
        this.basket = basket;
    }

    public List<Item> getBasket() {
        return this.basket.getBasket();
    }

    public List<Item> addItem(List<Integer> id) {
        List<Item> list = new LinkedList<>();
        for (Integer integer : id) {
            Item item = new Item(integer);
            this.basket.addItem(item);
            list.add(item);
        }
        return list;
    }
}
