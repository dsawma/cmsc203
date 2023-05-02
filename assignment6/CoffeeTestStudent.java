import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Test;

class CoffeeTestStudent {

	Coffee coffee1 =new Coffee("Coffee", Size.SMALL, true, true);
	Coffee coffee2 =new Coffee("Coffee", Size.SMALL, true, true);

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}
	
	@Test
	public void testGetExtraShot() {
		assertTrue(coffee1.getExtraShot());
	}
	
	@Test
	public void testGetExtraSyrup() {
		assertTrue(coffee1.getExtraSyrup());
	}
	
	@Test
	public void testGetShot() {
		assertEquals(.5,coffee1.getShot(),.5);
	}
	@Test
	public void testGetSyrup() {
		assertEquals(.5,coffee1.getSyrup(),.5);
	}
	
	
	@Test
	public void testEquals() {
		assertTrue(coffee1.equals(coffee2));
	}
	@Test
	public void testCalcPrice() {
		assertEquals(3.0, coffee1.calcPrice(), 3.0);
	}
	
	
	@Test
	public void testToString() {
		assertEquals("Coffee, SMALL, Extra Shot, Extra Syrup, $3.0", coffee1.toString());
	}
	
}
