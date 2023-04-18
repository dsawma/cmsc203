import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Test;

class HolidayBonusTestStudent {

	private double[][] dataSet1 = { { -640, 2342, 832 }, { -123, 524,23, 102 }, { 198, -192, 293 }, {291,-293, -192, 920}};

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}
	public void testCalculateHolidayBonusA() {
		try {
			double[] result = HolidayBonus.calculateHolidayBonus(dataSet1);
			assertEquals(10000.00, result[0], .001);
			assertEquals(5000.00, result[1], .001);
			assertEquals(4000.00, result[2], .001);
			assertEquals(10000.00, result[3], .001);
		} catch (Exception e) {
			fail("This should not have caused an Exception");
		}

	}

	@Test
	public void testCalculateTotalHolidayBonusA() {
		assertEquals(29000.00, HolidayBonus.calculateTotalHolidayBonus(dataSet1), .001);
	}
}
