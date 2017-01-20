package com.receiptgenerator.java.model;

/**
 * Created by N/A on 1/19/17.
 */
public class Item {
    private int qty;
    private String details;
    private Double price;

    public Item(int qty, String details, Double price){
        this.qty = qty;
        this.details = details;
        this.Double = price;
    }

    public int getQty(){
        return this.qty;
    }

    public String getDetails(){
        return this.details;
    }

    public Double getPrice(){
        return this.price;
    }
}
