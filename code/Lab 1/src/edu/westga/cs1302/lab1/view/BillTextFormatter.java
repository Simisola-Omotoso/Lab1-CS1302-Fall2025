package edu.westga.cs1302.lab1.view;

import edu.westga.cs1302.lab1.model.Bill;
import edu.westga.cs1302.lab1.model.BillItem;

/** Generates text of bill
 * 
 * @author Simisola Omotoso
 * @version Fall 2025
 */

public class BillTextFormatter {
	
	public static final double TIP = 0.2;
	public static final double TAX = 0.1;
	public static final double SUB_TOTAL = 0.0;

	/** Return a String containing the list of bill items and total for the bill.
	 * 
	 * @precondition none
	 * @postcondition none
	 * 
	 * @param bill new Bill object
	 * 
	 * @return a String containing the list of bill items and total for the bill
	 */
	
	public String getText(Bill bill) {
		String text = "ITEMS" + System.lineSeparator();
		double subTotal = SUB_TOTAL;
		for (BillItem item : bill.getItems()) {
			text += item.getName() + " - " + item.getAmount() + System.lineSeparator();
			subTotal += item.getAmount();
		}
		
		text += System.lineSeparator();
		text += "SUBTOTAL - $" + subTotal + System.lineSeparator();
		double tax = subTotal * TAX;
		double tip = subTotal * TIP;
		text += "TAX - $" + tax + System.lineSeparator();
		text += "TIP - $" + tip + System.lineSeparator();
		text += "TOTAL - $" + (subTotal + tip + tax);
		
		return text;
	}

}
