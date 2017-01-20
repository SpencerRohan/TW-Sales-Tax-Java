package com.receiptgenerator.java;

import com.receiptgenerator.java.model.ReceiptScanner;

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
        ReceiptScanner rScanner = new ReceiptScanner(queuedCartFiles);


    }
}
