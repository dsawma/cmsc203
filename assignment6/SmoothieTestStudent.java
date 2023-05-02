import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Test;

class SmoothieTestStudent {

	Smoothie smoothie1 =new Smoothie("Smoothie", Size.SMALL, 5, true);
	Smoothie smoothie2 =new Smoothie("Smoothie", Size.SMALL, 5, true);

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}
	
	@Test
	public void testGetNumOfFruits() {
		assertEquals(5,smoothie1.getNumOfFruits());
	}
	
	@Test
	public void testGetFruitCost() {
		assertEquals(.5,smoothie1.getFruitCost(),.5);
	}
	
	@Test
	public void testGetAddProtein() {
		assertTrue(smoothie1.getAddProtein());
	}
	@Test
	public void testGetProteinCost() {
		assertEquals(1.5,smoothie1.getProteinCost(),1.5);
	}
	
	
	@Test
	public void testEquals() {
		assertTrue(smoothie1.equals(smoothie2));
	}
	@Test
	public void testCalcPrice() {
		assertEquals(6.0, smoothie1.calcPrice(),6.0);
	}
	
	
	@Test
	public void testToString() {
		assertEquals("Smoothie, SMALL, 5 Fruits, Protein Powder, $6.0", smoothie1.toString());
	}

}
