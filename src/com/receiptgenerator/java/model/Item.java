package com.receiptgenerator.java.model;

import java.util.regex.Pattern;

/**
 * Created by N/A on 1/19/17.
 */
public class Item {
    private int qty;
    private String details;
    private Double price;
    private Boolean isImport = false;
    private Boolean isExempt = false;

    public Item(int qty, String details, Double price){
        this.qty = qty;
        this.details = details;
        this.price = price;
        setSaleType(details);
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

    private void setSaleType(String details){
        Pattern exemptPattern = Pattern.compile("pills|chocolate|book|wine");
        Pattern importPattern = Pattern.compile("importe");
        if (exemptPattern.matcher(details).find()) {
            this.isExempt = true;
        }

        if (importPattern.matcher(details).find()) {
            this.isImport = true;
        }
    }

    public Boolean isExempt(){
        return this.isExempt;
    }

    public Boolean isImport(){
        return this.isImport;
    }
}
