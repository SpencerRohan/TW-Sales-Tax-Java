package com.receiptgenerator.java;

import com.receiptgenerator.java.model.Purchase;
import com.receiptgenerator.java.model.ReceiptScanner;

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
        };

        String[] queuedCartFiles = (importCarts.length > 0) ?
                importCarts : defaultCarts;

        for (String cart : queuedCartFiles) {
            if (new File(cart).exists()){
                ReceiptScanner rScanner = new ReceiptScanner(cart);
                Purchase purchase = rScanner.getPurchase();

            }
        }


    }
}
