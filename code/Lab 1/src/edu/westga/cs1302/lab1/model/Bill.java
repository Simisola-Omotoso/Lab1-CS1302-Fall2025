package edu.westga.cs1302.lab1.model;

import java.util.ArrayList;

/** Stores information for a bill.
 * 
 * @author CS 1302
 * @version Fall 2025
 */
public class Bill {
	private ArrayList<BillItem> items;
	public static final double TIP = 0.2;
	public static final double TAX = 0.1;
	public static final double SUB_TOTAL = 0.0;
	
	/** Create a new empty Bill
	 * 
	 * @precondition none
	 * @postcondition none
	 * 
	 */
	public Bill() {
		this.items = new ArrayList<BillItem>();
	}
	
	/** Adds the item to the bill
	 * 
	 * @precondition item != null
	 * @postcondition item is added to the list of items in the bill
	 * 
	 * @param item the item to be added to the bill
	 */
	public void addItem(BillItem item) {
		if (item == null) {
			throw new IllegalArgumentException("item must not be null.");
		}
		this.items.add(item);
	}
	
	/** Returns list of items
	 * @precondition none
	 * @postcondition none
	 * @return list of items
	 */
	public ArrayList<BillItem> getItems() {
		return this.items;
	}

}
