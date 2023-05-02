import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;

class DayTestStudent {

	@Test
	public void testEnumDay(){
	Day day = Day.SUNDAY;
	System.out.println("Days enum is set a value: "+day);
	assertEquals(Day.valueOf("SUNDAY"), day);
	}
	

}
