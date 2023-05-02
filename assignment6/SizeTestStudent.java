import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SizeTestStudent {

	@Test
	public void testEnumSize(){
	Size size = Size.SMALL;
	System.out.println("Size enum is set a value: "+ size);
	assertEquals(Size.valueOf("SMALL"), size);
	}
	

}
