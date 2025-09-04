package edu.westga.cs1302.lab2.tests.view.bill_view;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import edu.westga.cs1302.lab2.model.Bill;

import edu.westga.cs1302.lab2.view.BillView;

class TestGetText {
	
	@Test
	public void testNormalGetText() {
		Bill bill = new Bill();
		BillView view = new BillView();
		String result = view.getText(bill);
		assertEquals(view.getText(bill), result);
	}

}
