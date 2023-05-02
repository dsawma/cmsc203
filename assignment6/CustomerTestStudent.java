import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Test;

class CustomerTestStudent {

	Customer customer1 =new Customer("Don", 21);
	Customer customer2 =new Customer(customer1);

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}
	
	@Test
	public void testToString() {
		assertEquals("Don, 21",customer1.toString());
	}
	
	@Test
	public void testGetName() {
		assertEquals("Don", customer1.getName());
	}
	
	@Test
	public void testGetAget() {
		assertEquals(21, customer1.getAge());
	}
	
	
	
}
