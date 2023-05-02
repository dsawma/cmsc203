import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Test;

class OrderTestStudent {

	Order orderOne = new Order(10, Day.MONDAY, new Customer("Don", 23));
	Order orderTwo = new Order(10, Day.MONDAY, new Customer("Don", 23));

	Coffee cf =new Coffee("Coffee", Size.SMALL, true, true);
	Alcohol al =new Alcohol("Alcohol", Size.SMALL, true);
	Smoothie sm =new Smoothie("Smoothie", Size.SMALL, 5, true);

	@Before
	public void setUp() throws Exception {
		orderOne.addNewBeverage("Coffee", Size.SMALL, true, true);
		orderOne.addNewBeverage("Alcohol", Size.SMALL);
		orderOne.addNewBeverage("Smoothie", Size.SMALL, 5, true);
		
	}

	@After
	public void tearDown() throws Exception {
		orderOne = null;
	}
	@Test
	public void testGetBeverage() {
		orderOne.addNewBeverage("Coffee", Size.SMALL, true, true);
		orderOne.addNewBeverage("Alcohol", Size.SMALL);
		orderOne.addNewBeverage("Smoothie", Size.SMALL, 5, true);
		
		assertTrue(orderOne.getBeverage(0).equals(cf));
		assertTrue(orderOne.getBeverage(1).equals(al));
		assertTrue(orderOne.getBeverage(2).equals(sm));
		
	}
	@Test
	public void testCompareTo() {
		assertEquals(0,orderOne.compareTo(orderOne));
	}
	
	@Test
	public void testIsWeekend() {
		assertFalse(orderOne.isWeekend());
	}
	@Test
	public void testFindNumOfBeveType() {
		orderOne.addNewBeverage("Coffee", Size.SMALL, true, true);
		orderOne.addNewBeverage("Alcohol", Size.SMALL);
		orderOne.addNewBeverage("Smoothie", Size.SMALL, 5, true);
		
		assertEquals(1,orderOne.findNumOfBeveType(Type.SMOOTHIE));
	}
	@Test
	public void testGetTotalItems() {
		orderOne.addNewBeverage("Coffee", Size.SMALL, true, true);
		orderOne.addNewBeverage("Alcohol", Size.SMALL);
		orderOne.addNewBeverage("Smoothie", Size.SMALL, 5, true);
		
		assertEquals(3,orderOne.getTotalItems());
	}
	
	

	@Test
	public void testCalcOrderTotal() {
		orderOne.addNewBeverage("Coffee", Size.SMALL, true, true);
		orderOne.addNewBeverage("Alcohol", Size.SMALL);
		orderOne.addNewBeverage("Smoothie", Size.SMALL, 5, true);
		
		assertEquals(11.0, orderOne.calcOrderTotal(), .01);

		

	}

}
