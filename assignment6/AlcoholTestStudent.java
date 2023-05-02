import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Test;

class AlcoholTestStudent {
	Alcohol alcohol1 =new Alcohol("Alcohol", Size.SMALL, true);
	Alcohol alcohol2 =new Alcohol("Alcohol", Size.SMALL, true);

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}
	
	@Test
	public void testGetWeekend() {
		assertTrue(alcohol1.getWeekend());
	}
	
	@Test
	public void testEquals() {
		assertTrue(alcohol1.equals(alcohol2));
	}
	@Test
	public void testCalcPrice() {
		assertEquals(2.6, alcohol1.calcPrice(), 2.6);
	}
	
	@Test
	public void testGetWeekendCost() {
		assertEquals(.6, alcohol1.getWeekendCost(), .6);
	}
	
	@Test
	public void testToString() {
		assertEquals("Alcohol, SMALL, Weekend, $2.6", alcohol1.toString());
	}
	
	

}
