import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CryptoManagerTestStudent {

	@Test
	public void testIsStringInBounds() {
		assertTrue(CryptoManager.isStringInBounds("JAVAFUN"));
		assertFalse(CryptoManager.isStringInBounds("javaOP"));
	
	}

	@Test
	public void testCaesarEncryption() {
		assertEquals("GHI", CryptoManager.caesarEncryption("DEF", 3));
	
	}

	@Test
	public void testBellasoEncryption() {
		assertEquals("XQMWH_\\USW", CryptoManager.bellasoEncryption("HELICOPTER", "PLANE"));
	
	}

	@Test
	public  void testCaesarDecryption() {
		assertEquals("PIZZA", CryptoManager.caesarDecryption("UN__F", 5));
	
	}

	@Test
	public void testBellasoDecryption() {
		assertEquals("SURFER", CryptoManager.bellasoDecryption("*V(K\\S", "WAVE"));
	}

}
