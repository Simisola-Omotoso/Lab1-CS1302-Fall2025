package edu.westga.cs1302.lab2.tests.model.bill;

import org.junit.jupiter.api.Test;

import edu.westga.cs1302.lab2.model.Bill;

import edu.westga.cs1302.lab2.model.BillItem;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

/** Test addItem in Bill class.
 * 
 * @author Simisola Omotoso
 * @version Fall 2025
 */

public class TestAddItem {
	
	/** Tests illegal argument exception
	 * 
	 * @precondition none
	 * @postcondition none
	 * 
	 */
	
	@Test
	public void testIllegalArgumentExceptionAddItem() {
		Bill bill = new Bill();
		assertThrows(IllegalArgumentException.class, () -> {
			bill.addItem(null);
		});
	}
	
	/** Tests adding one item
	 * 
	 * @precondition none
	 * @postcondition none
	 * 
	 */
	
	@Test
	public void testOneAddItem() {
		Bill bill = new Bill();
		BillItem item = new BillItem("Boots", 16.99);
		bill.addItem(item);
		assertEquals(1, bill.getItems().size());
	}
	
	/** Tests adding two items
	 * 
	 * @precondition none
	 * @postcondition none
	 * 
	 */
	
	@Test
	public void testTwoAddItem() {
		Bill bill = new Bill();
		BillItem item = new BillItem("Boots", 16.99);
		BillItem item2 = new BillItem("Lipstick", 4.99);
		bill.addItem(item);
		bill.addItem(item2);
		assertEquals(2, bill.getItems().size());
	}
	
	/** Tests adding three items
	 * 
	 * @precondition none
	 * @postcondition none
	 * 
	 */
	
	@Test
	public void testThreeAddItem() {
		Bill bill = new Bill();
		BillItem item = new BillItem("Boots", 16.99);
		BillItem item2 = new BillItem("Lipstick", 4.99);
		BillItem item3 = new BillItem("Notebook", 1.99);
		bill.addItem(item);
		bill.addItem(item2);
		bill.addItem(item3);
		assertEquals(3, bill.getItems().size());
	}

}
