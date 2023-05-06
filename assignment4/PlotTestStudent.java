import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PlotTestStudent {
	 Plot plot1, plot2, plot3;

	@BeforeEach
	 void setUp() throws Exception {
		plot1 = new Plot();
		plot2 = new Plot(5, 5, 7, 4);
		plot3 = new Plot(plot1);
	}

	@AfterEach
	void tearDown() throws Exception {
		plot1 = plot2 = plot3 = null;
	}
	
	@Test
	void testGetX() {
		assertEquals(0, plot1.getX());
	}
	@Test
	void testGetY() {
		assertEquals(5, plot2.getY());
	}
	@Test
	void testGetWidth() {
		assertEquals(1, plot3.getWidth());
	}
	@Test
	void testGetDepth() {
		assertEquals(1, plot1.getDepth());
	}
	
	@Test
	void testSetX() {
		plot1.setX(2);
		assertEquals(2, plot1.getX());
	}
	@Test
	void testSetY() {
		plot2.setY(6);
		assertEquals(6, plot2.getY());
	}
	@Test
	void testSetWidth() {
		plot3.setWidth(8);
		assertEquals(8, plot3.getWidth());
	}
	@Test
	void testSetDepth() {
		plot1.setDepth(7);
		assertEquals(7, plot1.getDepth());
	}

	@Test
	 void testOverlaps() {
		assertFalse(plot1.overlaps(plot2)); 
	}
	
	@Test
	 void testEncompasses() {
		assertFalse(plot2.encompasses(plot1)); 
	}
	
	@Test
	void testToString() {
		assertEquals("0,0,1,1",plot1.toString());	
	}

}
