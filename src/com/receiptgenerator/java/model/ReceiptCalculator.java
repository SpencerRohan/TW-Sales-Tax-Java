package com.receiptgenerator.java.model;

import java.util.List;

public class ReceiptCalculator {
    private Double taxTotal = 0.00;
    private Double saleTotal = 0.00;
    private Double itemTotal = 0.00;

    public ReceiptCalculator(List<Item> items){
        for(Item item: items){
            this.itemTotal = this.itemTotal + item.getPrice();
            this.taxTotal = this.taxTotal + computeSalesTax(item);
        }
        this.saleTotal = this.itemTotal + this.taxTotal;
    }

    private Double computeSalesTax(Item item){
        Double tax = .10;
        if (item.isExempt()){
            tax = .00;
        }

        if (item.isImport()){
            tax = tax + .05;
        }
        Double rounded = roundAmount(item.getPrice()*tax);
        item.setAfterTax(rounded);
        return rounded;
    }

    public Double getTaxTotal() {
        return this.taxTotal;
    }

    public Double getSaleTotal() {
        return this.saleTotal;
    }

    private Double roundAmount(Double amount){
        return Math.ceil((amount * 20.0)) / 20.0;
    }

    private Double computeSaleTotal(){
        return this.saleTotal = (this.taxTotal + this.itemTotal);
    }
}
