package com.receiptgenerator.java.model;

public class ReceiptConsole {
    private String itemFormat = "%1$-40s %2$6.2f %n";
    private String taxFormat = "%1$40s %2$6.2f %n";
    private String totalFormat = "%1$40s %2$6.2f %n%n%n";

    public void purchaseList(Item item) {
        System.out.format(itemFormat, item.getQty() + " " + item.getDetails() +": ", item.getAfterTax());
    }


    public void salesTax(Double taxTotal) {
        System.out.format(taxFormat, "Sales Taxes:", taxTotal);
    }

    public void totalSale(Double saleTotal) {
        System.out.format(totalFormat, "Total:", saleTotal);
    }

    public void lineBreak() {
        String dashes = new String(new char[48]).replace("\0", "-");
        System.out.format(dashes+"%n");
    }
}
