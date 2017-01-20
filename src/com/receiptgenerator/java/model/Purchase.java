package com.receiptgenerator.java.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by N/A on 1/19/17.
 */
public class Purchase {
    private List<Item> inventory = new ArrayList<Item>();

    public Item addItem(int quantity, String details, Double price) {
//        System.out.println(quantity +" "+details+": "+ price);
        Item item = new Item();
        item.addPrice(price);
        item.addQuantity(quantity);
        item.addDetails(details);
        this.inventory.add(item);
//        this.subtotal = this.subtotal + price;
        System.out.printf("%.2f" + "\n", this.subtotal);
        return item;
    }

    public List<Item> getInventory(){
        return this.inventory;
    }


}
