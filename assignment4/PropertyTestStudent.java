
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PropertyTestStudent {

	Property propertyOne, propertyTwo, propertyThree, propertyFour;
	

	@BeforeEach
	void setUp() throws Exception {
		propertyOne = new Property();
		propertyTwo = new Property("Eastwood", "Germantown", 1600.00, "Clint");
		propertyThree = new Property("Carter", "New York", 5000.00, "Bill", 10,10,2,2);
		propertyFour = new Property(propertyOne);
	}

	@AfterEach
	void tearDown() throws Exception {
		propertyOne =propertyTwo = propertyThree = propertyFour= null;
	}

	@Test
	void testGetPropertyName() {
		assertEquals("", propertyOne.getPropertyName());
	}
	
	@Test
	void testGetCity() {
		assertEquals("Germantown", propertyTwo.getCity());
	}
	@Test
	void testGetRentAmount() {
		assertEquals(5000.00, propertyThree.getRentAmount());
	}
	@Test
	void testGetOwner() {
		assertEquals("", propertyFour.getOwner());
	}

	@Test
	void testGetPlot() {
		assertEquals(0, propertyFour.getPlot().getX());
		assertEquals(0, propertyFour.getPlot().getY());
		assertEquals(1, propertyFour.getPlot().getWidth());
		assertEquals(1, propertyFour.getPlot().getDepth());
	}
	
	@Test
	void testSetPropertyName() {
		propertyOne.setPropertyName("Wow");
		assertEquals("Wow", propertyOne.getPropertyName());
	}
	
	@Test
	void testSetCity() {
		propertyTwo.setCity("Strawberry");
		assertEquals("Strawberry", propertyTwo.getCity());
	}
	
	@Test
	void testSetRentalAmount() {
		propertyThree.setRentalAmount(505.00);
		assertEquals(505.0, propertyThree.getRentAmount());
	}
	
	@Test
	void testSetOwner() {
		propertyFour.setPropertyName("Ethan");
		assertEquals("Ethan", propertyFour.getPropertyName());
	}
	
	@Test
	void testSetPlot() {
		propertyOne.setPlot(5,5,5,5);
		assertEquals(5, propertyOne.getPlot().getX());
		assertEquals(5, propertyOne.getPlot().getY());
		assertEquals(5, propertyOne.getPlot().getWidth());
		assertEquals(5, propertyOne.getPlot().getDepth());
	}

	@Test
	void testToString() {
		assertEquals("Eastwood,Germantown,Clint,1600.0",propertyTwo.toString());	
	}

}
