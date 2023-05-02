import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Test;

class BevShopTestStudent {

	BevShop orders =new BevShop();
	

	@Before
	public void setUp() throws Exception {
		orders.startNewOrder(9, Day.SUNDAY, "Don", 23);
		orders.processAlcoholOrder("Alcohol", Size.SMALL);
		orders.processSmoothieOrder("Smoothie", Size.SMALL, 5, true);
		orders.processCoffeeOrder("Coffee", Size.SMALL, true, true);
	}

	@After
	public void tearDown() throws Exception {
		orders = null;
	}
	
	@Test
	public void testIsMaxFruit() {
		assertFalse(orders.isMaxFruit(3));
	}
	
	@Test
	public void testIsValidTime() {
		assertTrue(orders.isValidTime(10));
	}
	
	@Test
	public void testIsValidAge() {
		assertTrue(orders.isValidAge(21));
	}
	
	@Test
	public void testIsEligibleForMore() {
		orders.startNewOrder(9, Day.SUNDAY, "Don", 23);
		orders.processAlcoholOrder("Alcohol", Size.SMALL);
		orders.processSmoothieOrder("Smoothie", Size.SMALL, 5, true);
		orders.processCoffeeOrder("Coffee", Size.SMALL, true, true);
		
		assertTrue(orders.isEligibleForMore());
	}
	@Test
	public void testGetNumOfAlcoholDrink() {
		orders.startNewOrder(9, Day.SUNDAY, "Don", 23);
		orders.processAlcoholOrder("Alcohol", Size.SMALL);
		orders.processSmoothieOrder("Smoothie", Size.SMALL, 5, true);
		orders.processCoffeeOrder("Coffee", Size.SMALL, true, true);
		
		assertEquals(1,orders.getNumOfAlcoholDrink());
	}
	
	@Test
	public void testTotalMonthlySale() {
		orders.startNewOrder(9, Day.SUNDAY, "Don", 23);
		orders.processAlcoholOrder("Alcohol", Size.SMALL);
		orders.processSmoothieOrder("Smoothie", Size.SMALL, 5, true);
		orders.processCoffeeOrder("Coffee", Size.SMALL, true, true);
		
		assertEquals(11.6,orders.totalMonthlySale());
	}
	
	@Test
	public void testTotalNumOfMonthlyOrders() {
		orders.startNewOrder(9, Day.SUNDAY, "Don", 23);
		orders.processAlcoholOrder("Alcohol", Size.SMALL);
		orders.processSmoothieOrder("Smoothie", Size.SMALL, 5, true);
		orders.processCoffeeOrder("Coffee", Size.SMALL, true, true);
		
		assertEquals(1,orders.totalNumOfMonthlyOrders());
	}
}
