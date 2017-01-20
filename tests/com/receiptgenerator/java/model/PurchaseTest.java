package com.receiptgenerator.java.model;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by N/A on 1/20/17.
 */
public class PurchaseTest {
    private Purchase purchase;

    @Before
    public void initObjects() {
       purchase = new Purchase();
    }

    @Test
    public void addingItemsIncrementsInventory() throws Exception {
        purchase.addItem(1, "Ghostbuster Proton Pack", 9.99);

        assertEquals(1, purchase.getInventory().size());
    }

    @Test
    public void getInventory() throws Exception {

    }

}