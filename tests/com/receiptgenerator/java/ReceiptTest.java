package com.receiptgenerator.java;

import com.receiptgenerator.java.model.Purchase;
import com.receiptgenerator.java.model.ReceiptCalculator;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReceiptTest {
    private Purchase purchase;
    private ReceiptCalculator calculator;
    private Double expectedTaxTotal;
    private Double expectedSaleTotal;
    private Double taxTotal;
    private Double saleTotal;


    @Before
    public void setUp(){
        purchase = new Purchase();
    }

    @Test
    public void passingOutput1()throws Exception {
        purchase.addItem(1, "book", 12.49);
        purchase.addItem(1, "music CD", 14.99);
        purchase.addItem(1, "chocolate bar", 0.85);
        calculator = new ReceiptCalculator(purchase.getInventory());
        expectedSaleTotal = 29.83;
        expectedTaxTotal = 1.50;

        taxTotal  = (double) Math.round(calculator.getTaxTotal() * 100) / 100;
        saleTotal = (double) Math.round(calculator.getSaleTotal() * 100) / 100;

        assertEquals(expectedTaxTotal, taxTotal);
        assertEquals(expectedSaleTotal, saleTotal);
    }


    @Test
    public void passingOutput2()throws Exception {
        purchase.addItem(1, "imported box of chocolates", 10.00);
        purchase.addItem(1, "imported bottle of perfume", 47.50);
        calculator = new ReceiptCalculator(purchase.getInventory());
        expectedSaleTotal = 65.15;
        expectedTaxTotal = 7.65;

        taxTotal  = (double) Math.round(calculator.getTaxTotal() * 100) / 100;
        saleTotal = (double) Math.round(calculator.getSaleTotal() * 100) / 100;

        assertEquals(expectedTaxTotal, taxTotal);
        assertEquals(expectedSaleTotal, saleTotal);
    }

    @Test
    public void passingOutput3()throws Exception {
        purchase.addItem(1, "imported bottle of perfume", 27.99);
        purchase.addItem(1, "bottle of perfume", 18.99);
        purchase.addItem(1, "packet of headache pills", 9.75);
        purchase.addItem(1, "box of imported chocolates", 11.25);
        calculator = new ReceiptCalculator(purchase.getInventory());
        expectedSaleTotal = 74.68;
        expectedTaxTotal = 6.70;

        taxTotal  = (double) Math.round(calculator.getTaxTotal() * 100) / 100;
        saleTotal = (double) Math.round(calculator.getSaleTotal() * 100) / 100;

        assertEquals(expectedTaxTotal, taxTotal);
        assertEquals(expectedSaleTotal, saleTotal);
    }

}