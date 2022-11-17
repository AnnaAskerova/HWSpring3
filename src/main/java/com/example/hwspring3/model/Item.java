package com.example.hwspring3.model;

public class Item {
    private final int id;

    public Item(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Item{" +
                "id=" + id +
                '}';
    }
}
