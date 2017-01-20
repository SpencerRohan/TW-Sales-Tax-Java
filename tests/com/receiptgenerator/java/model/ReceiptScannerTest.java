package com.receiptgenerator.java.model;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;


public class ReceiptScannerTest {
    private ReceiptScanner rScanner;
    private Purchase purchase;
    private Purchase scannedPurchase;
    private Item item1;
    private Item item2;
    private Item item3;

    @Before
    public void setUp(){
        rScanner = new ReceiptScanner("assets/txt/input1.txt");
        scannedPurchase = rScanner.getPurchase();
        purchase = new Purchase();
        item1 = purchase.addItem(1, "book", 12.49);
        item2 = purchase.addItem(1, "music CD", 14.99);
        item3 = purchase.addItem(1, "chocolate bar", 0.85);
    }

    @Test
    public void creationOfScannerCreatesAPurchase() throws Exception {
        assertEquals(Purchase.class , scannedPurchase.getClass());
    }

    @Test
    public void creationOfScannerReadsInputAccuratly() throws Exception {
        List actualInventory = purchase.getInventory();
        List testInventory = scannedPurchase.getInventory();
        Item testItem = (Item) testInventory.get(0);

        assertEquals(actualInventory.size(), testInventory.size());
        assertEquals(item1.getDetails(), testItem.getDetails());
    }

}