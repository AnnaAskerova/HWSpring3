package com.example.hwspring3.service;

import com.example.hwspring3.model.Item;
import com.example.hwspring3.record.ItemRequest;
import com.example.hwspring3.repository.Basket;
import org.springframework.stereotype.Service;

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

    public Item addItem(ItemRequest itemRequest) {
        Item item = new Item(itemRequest.getId());
        this.basket.addItem(item);
        return item;
    }
}
