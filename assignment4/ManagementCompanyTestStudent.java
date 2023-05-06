import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ManagementCompanyTestStudent {
	
	Property property1;
	
	ManagementCompany mc1, mc2, mc3, mc4;
	Plot plot1;

		@BeforeEach
		 void setUp() throws Exception {
			mc1 = new ManagementCompany();
			mc2 = new ManagementCompany("Wawa", "14235", 5.0);
			mc3 = new ManagementCompany("Riot", "9382", 10.0, 5, 5, 2, 2);
			mc4= new ManagementCompany(mc1);
		}

		@AfterEach
		void tearDown() throws Exception {
			mc1 = mc2 = mc3 = mc4= null;
		}

		@Test
		void testSetName() {
			mc1.setName("LEL");
			assertEquals("LEL", mc1.getName());
		}
		@Test
		void testSetTaxID() {
			mc2.setTaxID("6532");
			assertEquals("6532", mc2.getTaxID());
		}
		@Test
		void testSetMgmFee() {
			mc3.setMgmFeePer(8);
			assertEquals(8, mc3.getMgmFeePer(),0.1);
		}
		
	
		@Test
		void testGetName() {
			assertEquals("", mc1.getName());
		}
		@Test
		void testGetTaxID() {
			assertEquals("14235", mc2.getTaxID());
		}
		@Test
		void testGetMgmFee() {
			assertEquals(10.0, mc3.getMgmFeePer(), 0.1);
		}
		
		@Test
		void testGetTotalRent() {
			assertEquals(0.0, mc1.getTotalRent(), 0.1);
		}
		@Test
		public void testAddProperty1() {
			property1 = new Property ();		 
			assertEquals(mc3.addProperty(property1),0,0);
		}
		
		@Test
		public void testAddProperty2() {
			property1 = new Property ("Eastwood", "Germantown", 1600.00, "Clint");		 
			assertEquals(mc2.addProperty(property1),0,0);
		}
		@Test
		public void testAddProperty3() {
			property1 = new Property ("Carter", "New York", 5000.00, "Bill", 10,10,2,2);		 
			assertEquals(mc4.addProperty(property1),0,0);
		}
		@Test
		 void testIsPropertiesFull() {
			assertFalse(mc2.isPropertiesFull()); 
		}
		@Test
		public void testGetPropertiesCount() {
			property1 = new Property ();		 
			assertEquals(mc1.addProperty(property1),0,0);	
			assertEquals(mc1.getPropertiesCount(), 1);
		}
		@Test
		 void testIsManagementFeeValid() {
			assertTrue(mc2.isManagementFeeValid()); 
		}
		@Test
		public void testToString() {
			property1 = new Property ("Eastwood", "Germantown", 1600.00, "Clint");		 
			mc2.addProperty(property1);	
			String pStr = "List of the properties for " + mc2.getName() + ", " + "taxID: " + mc2.getTaxID() + "\n";
			pStr += "______________________________________________________\n";
			pStr += "Sunsational,Beckman,BillyBob Wilson,2613.0\n";
			pStr += "______________________________________________________\n";
			pStr += "\n Total management Fee: " + (property1.getRentAmount() * mc2.getMgmFeePer()) / 100;
		}


}
