package com.example.hwspring3.controller;

import com.example.hwspring3.model.Item;
import com.example.hwspring3.service.StoreService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StoreController {
    private final StoreService storeService;

    public StoreController(StoreService storeService) {
        this.storeService = storeService;
    }

    @GetMapping("/order/get")
    public List<Item> getBasket() {
        return this.storeService.getBasket();
    }

    @GetMapping("/order/add")
    public List<Item> addItem(@RequestParam("id") List<Integer> id) {
            return this.storeService.addItem(id);
    }
}
