package edu.westga.cs1302.lab2.tests.model.bill_item;

import org.junit.jupiter.api.Test;

import edu.westga.cs1302.lab2.model.BillItem;

import static org.junit.jupiter.api.Assertions.assertThrows;

/** Tests constructor in BillItem.
 * 
 * @author Simisola Omotoso
 * @version Fall 2025
 */

public class TestConstructor {
	
	/** Test name equals illegal argument
	 * 
	 * @precondition none
	 * @postcondition none
	 * 
	 */
	
	@Test
	public void testNameEqualsNullIllegalArgumentExceptionBillItemConstructor() {
		assertThrows(IllegalArgumentException.class, () -> {
			new BillItem(null, 3.8);
		});
	}
	
	/** Test negative number illegal argument
	 * 
	 * @precondition none
	 * @postcondition none
	 * 
	 */
	
	@Test
	public void testNegativesNullIllegalArgumentExceptionBillItemConstructor() {
		assertThrows(IllegalArgumentException.class, () -> {
			new BillItem("Notebook", -3.8);
		});
	}

}
