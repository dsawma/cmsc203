import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TypeTestStudent {

	@Test
	public void testEnumType(){
	Type type = Type.COFFEE;
	System.out.println("Type enum is set a value: "+type);
	assertEquals(Type.valueOf("COFFEE"), type);
	}
	
}
