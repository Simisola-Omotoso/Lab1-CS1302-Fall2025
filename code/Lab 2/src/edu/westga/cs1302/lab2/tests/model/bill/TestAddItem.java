package edu.westga.cs1302.lab2.tests.model.bill;

import org.junit.jupiter.api.Test;

import edu.westga.cs1302.lab2.model.Bill;

import edu.westga.cs1302.lab2.model.BillItem;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Assertions.*;

public class TestAddItem {
	
	@Test
	public void testIllegalArgumentExceptionAddItem() {
		Bill bill = new Bill();
		assertThrows(IllegalArgumentException.class, () -> {
			bill.addItem(null);
		});
	}
	
	@Test
	public void testNormalAddItem() {
		Bill bill = new Bill();
		BillItem item = new BillItem("Boots", 16.99);
		bill.addItem(item);
		assertEquals(1, bill.getItems().size());
	}

}
