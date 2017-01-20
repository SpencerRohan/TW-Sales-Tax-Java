package com.receiptgenerator.java.model;

import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

public class ReceiptCalculatorTest {
    private Purchase purchase;
    private Item item1;
    private Item item2;
    private Item item3;
    private ReceiptCalculator calculator;

    @Before
    public void setUp() {
        purchase = new Purchase();
        item1 = purchase.addItem(1, "book", 12.49);
        item2 = purchase.addItem(1, "music CD", 14.99);
        item3 = purchase.addItem(1, "chocolate bar", 0.85);
        calculator = new ReceiptCalculator(purchase.getInventory());
    }

    @Test
    public void calculatorCorrectlyProvidesAccurateSaleTotal() throws Exception {
        Double expectedTotal = 29.83;
        Double saleTotal  = Math.floor(calculator.getSaleTotal() * 100) / 100;
        assertEquals(expectedTotal, saleTotal);
    }

    @Test
    public void calculatorCorrectlyProvidesAccurateTaxTotal() throws Exception {
        Double expectedTotal = 29.83;
        Double taxTotal  = Math.floor(calculator.getSaleTotal() * 100) / 100;

        assertEquals(expectedTotal, taxTotal);
    }


}