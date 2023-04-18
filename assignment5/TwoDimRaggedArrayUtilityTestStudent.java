import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;


import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Test;

class TwoDimRaggedArrayUtilityTestStudent {

private double[][] dataSet1 = {{-1.23, 923, 2392, 395, -86, 3},
		{684, -965.3, -5.99 ,364.9 ,21, 74.3},
		{38, -85.2, 948, 192 ,2874.2, 95},
		{493.2, 94.75, 434, -293.2, 932.2 ,5},
		{745.43, -283, 73.23, 583.43, 823.2, 923.2 }};

	
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}
	
	@Test
	
	public void testGetTotal() {
		assertEquals(12392.12,TwoDimRaggedArrayUtility.getTotal(dataSet1),.001);
	}
	@Test
	public void testGetAverage() {
		assertEquals(413.07,TwoDimRaggedArrayUtility.getAverage(dataSet1),.001);
	}
	@Test
	public void testGetRowTotal() {
		assertEquals(172.91,TwoDimRaggedArrayUtility.getRowTotal(dataSet1,1),.001);
	}
	@Test
	public void testGetColumnTotal() {
		assertEquals(1959.4,TwoDimRaggedArrayUtility.getColumnTotal(dataSet1,0),.001);
	}
	@Test
	public void testGetHighestInRow() {
		assertEquals(932.20,TwoDimRaggedArrayUtility.getHighestInRow(dataSet1,3),.001);
	}
	@Test
	public void testGetHighestInRowIndex() {
		assertEquals(4,TwoDimRaggedArrayUtility.getHighestInRowIndex(dataSet1,3),.001);
	}
	
	@Test
	public void testGetLowestInRow() {
		assertEquals(-86.00,TwoDimRaggedArrayUtility.getLowestInRow(dataSet1,0),.001);
	}
	@Test
	public void testGetLowestInRowIndex() {
		assertEquals(4.0,TwoDimRaggedArrayUtility.getLowestInRowIndex(dataSet1,0),.001);
	}
	@Test
	public void testGetHighestInColumn() {
		assertEquals(583.43,TwoDimRaggedArrayUtility.getHighestInColumn(dataSet1,3),.001);
	}
	@Test
	public void testGetHighestInColumnIndex() {
		assertEquals(0.0,TwoDimRaggedArrayUtility.getHighestInColumnIndex(dataSet1,2),.001);
	}
	@Test
	public void testGetLowestInColumn() {
		assertEquals(-5.99,TwoDimRaggedArrayUtility.getLowestInColumn(dataSet1,2),.001);
	}
	@Test
	public void testGetLowestInColumnIndex() {
		assertEquals(4.0,TwoDimRaggedArrayUtility.getLowestInColumnIndex(dataSet1,2),.001);
	}
	@Test
	public void testgGetHighestInArray() {
		assertEquals(2874.2,TwoDimRaggedArrayUtility.getHighestInArray(dataSet1),.001);
	}
	@Test
	public void testGetLowestInArray() {
		assertEquals(-965.3,TwoDimRaggedArrayUtility.getLowestInArray(dataSet1),.001);
	}

}
