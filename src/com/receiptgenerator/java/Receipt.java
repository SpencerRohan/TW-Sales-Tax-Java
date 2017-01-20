package com.receiptgenerator.java;

import com.receiptgenerator.java.model.*;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by N/A on 1/19/17.
 */
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
//                ReceiptCalculator calculate = new ReceiptCalculator(purchase.getInventory());
                ReceiptConsole display = new ReceiptConsole();
                for(Item item: purchase.getInventory()){
                    display.purchaseList(item);
                    System.out.println(item.isExempt());
                    System.out.println(item.isImport());
                    System.out.println(item.getDetails());
                }
//                display.salesTax(calculate.getTaxTotal());
//                display.total(calculate.getSaleTotal());

            }
        }


    }
}
