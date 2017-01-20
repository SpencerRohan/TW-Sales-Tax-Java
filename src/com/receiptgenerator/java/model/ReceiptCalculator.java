package com.receiptgenerator.java.model;


import java.util.List;

/**
 * Created by N/A on 1/19/17.
 */
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
//        System.out.printf("%.2f" + "\n",this.taxTotal);
//        System.out.printf("%.2f" + "\n",this.saleTotal);
    }

    private Double computeSalesTax(Item item){
        Double tax = new Double(.10);
        if (item.isExempt()){
            tax = .00;
        }

        if (item.isImport()){
            tax = tax + .05;
        }
        Double rounded = roundAmount(item.getPrice()*tax);
        item.setAfterTax(rounded);


//        System.out.printf("%.2f" + "\n", item.getAfterTax());

        return rounded;

    }

    private Double computeSaleTotal(){

       return this.saleTotal = (this.taxTotal + this.itemTotal);
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
}
