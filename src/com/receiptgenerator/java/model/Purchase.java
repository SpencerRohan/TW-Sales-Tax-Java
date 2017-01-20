package com.receiptgenerator.java.model;

import java.util.ArrayList;
import java.util.List;

public class Purchase {
    private List<Item> inventory = new ArrayList<Item>();

    public Item addItem(int quantity, String details, Double price) {
        Item item = new Item(quantity, details, price);
        this.inventory.add(item);
        return item;
    }

    public List<Item> getInventory(){
        return this.inventory;
    }


}
