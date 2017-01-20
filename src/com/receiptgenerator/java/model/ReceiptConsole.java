package com.receiptgenerator.java.model;

public class ReceiptConsole {
    private String itemFormat = "%1$-40s %2$10.2f %n";
    private String totalFormat = "%1$40s %2$10.2f %n";
    private String lineFormat = "%1$40s %2$10.2f %n";

    public void purchaseList(Item item) {
        System.out.format(itemFormat, item.getQty() + " " + item.getDetails() +": ", item.getAfterTax());
    }


    public void salesTax(Double taxTotal) {
        System.out.format(totalFormat, "Sales Taxes:", taxTotal);
//        System.out.printf("Sales Taxes" +": ");
//        System.out.printf("%.2f" + "\n", taxTotal);
    }

    public void totalSale(Double saleTotal) {
        System.out.format(totalFormat, "Total:", saleTotal);
//
//        System.out.printf("Total" +": ");
//        System.out.printf("%.2f" + "\n",saleTotal);
    }

    public void lineBreak() {
    }
}
