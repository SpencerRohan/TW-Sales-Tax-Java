package com.receiptgenerator.java.model;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ItemTest {
    private Item item;
    private int qty;
    private String details;
    private Double price;

    @Before
    public void setUp() {
        qty = 1;
        details = "Evil Dead Boomstick Edition";
        price = 6.99;
        item = new Item(qty, details, price);
    }

    @Test
    public void getQtyReturnsTheCorrectQuantity() throws Exception {
        assertEquals(qty, item.getQty());
    }

    @Test
    public void getDetailsReturnsTheCorrectDetails() throws Exception {
        assertEquals(details, item.getDetails());
    }

    @Test
    public void getPriceReturnsTheCorrectPrice() throws Exception {
        assertEquals(price, item.getPrice());
    }

    @Test
    public void isExemptIsProperlySet() throws Exception {
        String exemptDetails = "pills and food";

        Item exemptItem = new Item( qty, exemptDetails, price);

        assertEquals(true, exemptItem.isExempt());
        assertEquals(false, item.isExempt());
    }

    @Test
    public void isImportIsProperlySet() throws Exception {
        String importDetails = "imported stuff";

        Item exemptItem = new Item( qty, importDetails, price);

        assertEquals(true, exemptItem.isImport());
        assertEquals(false, item.isImport());
    }

    @Test
    public void setAfterTaxSetsCorrectAfterTaxPrice() throws Exception {
        Double amount = 2.00;

        item.setAfterTax(amount);

        assertEquals(amount, item.getAfterTax());
    }

    @Test
    public void getAfterTaxIsNullIfNotSet() throws Exception {
        assertEquals(null, item.getAfterTax());
    }

}