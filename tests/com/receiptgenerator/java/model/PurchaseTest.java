package com.receiptgenerator.java.model;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class PurchaseTest {
    private Purchase purchase;
    private Item item;

    @Before
    public void setUp() {
       purchase = new Purchase();
       item = purchase.addItem(1, "Ghostbuster Proton Pack", 9.99);
    }

    @Test
    public void addingItemsIncrementsInventory() throws Exception {
        assertEquals(1, purchase.getInventory().size());
    }

    @Test
    public void gettingInventoryReturnsAList() throws Exception {
        assertEquals(ArrayList.class, purchase.getInventory().getClass());
    }

    @Test
    public void addingItemsReturnsItem() throws Exception {
        assertEquals(Item.class, item.getClass());
    }
}