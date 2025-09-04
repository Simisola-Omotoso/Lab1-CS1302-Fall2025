package edu.westga.cs1302.lab2.tests.model.bill_item;

import org.junit.jupiter.api.Test;

import edu.westga.cs1302.lab2.model.Bill;

import edu.westga.cs1302.lab2.model.BillItem;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Assertions.*;

public class TestConstructor {
	
	@Test
	public void testNameEqualsNullIllegalArgumentExceptionBillItemConstructor() {
		assertThrows(IllegalArgumentException.class, () -> {
			new BillItem(null, 3.8);
		});
	}

}
