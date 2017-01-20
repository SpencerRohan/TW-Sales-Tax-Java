package com.receiptgenerator.java;

import com.receiptgenerator.java.model.Item;
import com.receiptgenerator.java.model.Purchase;
import com.receiptgenerator.java.model.ReceiptCalculator;
import com.receiptgenerator.java.model.ReceiptConsole;
import com.receiptgenerator.java.model.ReceiptScanner;

import java.io.File;
import java.io.IOException;

public class Receipt {
    public static void main(String[] importCarts) throws IOException {
        String[] defaultCarts = {
                "assets/txt/input1.txt",
                "assets/txt/input2.txt",
                "assets/txt/input3.txt"
        };

        String[] queuedCartFiles = (importCarts.length > 0) ?
                importCarts : defaultCarts;

        for (String cart : queuedCartFiles) {
            if (new File(cart).exists()){
                ReceiptScanner rScanner = new ReceiptScanner(cart);
                Purchase purchase = rScanner.getPurchase();
                ReceiptCalculator calculate = new ReceiptCalculator(purchase.getInventory());
                ReceiptConsole display = new ReceiptConsole();
                for(Item item: purchase.getInventory()){
//                    display.purchaseList(item);
//                    display.salesTax(calculate.getTaxTotal());
//                    display.totalSale(calculate.getSaleTotal());
                }
//                display.salesTax(calculate.getTaxTotal());
//                display.total(calculate.getSaleTotal());

            }
        }


    }
}
