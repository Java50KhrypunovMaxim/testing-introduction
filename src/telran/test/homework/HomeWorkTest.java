package telran.test.homework;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class HomeWorkTest {

	@Test
	void compareToTest() 
	{
	assertEquals(0, "123".compareTo("123"));
	assertEquals(-2, "1".compareTo("321"));
	assertEquals(2, "3".compareTo("123"));
	assertEquals(2, "Maxim".compareTo("Max"));
	assertEquals(-28, "1".compareTo("Max"));
	assertTrue("Maxim".compareTo("Max") == 2);
	assertFalse ("Maxim".compareTo("Max") != 2 );
	}
    
	@Test
	void compareToIgnoreCaseTest() 
	{
	assertEquals(0, "max".compareToIgnoreCase("MAX"));
	assertEquals(2, "maXim".compareToIgnoreCase("MAX"));
	assertTrue("Maxim".compareTo("MAXI") == 32);
	assertEquals(2, "12353".compareToIgnoreCase("123"));
	}
	
	@Test
	void testConcat() {
		
		String word1 = "Hello";
		String word2 = "Maxim";
		String word3 = " !";
		String newWord = "HelloMaxim";
		assertEquals("HelloMaxim",  word1.concat(word2));
		assertEquals("HelloMaxim !",  word1.concat(word2).concat(word3));
		assertEquals(newWord, word1.concat(word2));
		assertEquals(newWord, word1.concat(word2));
	}
		
	@Test
	void startWithTest() {
		String res = "Maxim";
		assertTrue (res.startsWith("M"));
		assertTrue (res.startsWith(""));// empty string also true
		assertFalse(res.startsWith("aM"));
	}
	
	@Test
	void testEndWith() {
		String res = "Maxim";
		assertTrue (res.endsWith("xim"));
		assertTrue (res.endsWith("m"));
		assertTrue (res.endsWith(""));
		assertFalse(res.endsWith("xIM"));
	}
	
	
	@Test
	void testEqualsIgnoreCase()
	{
		assertTrue("MaXiM".equalsIgnoreCase("maxim"));
		assertFalse("MaXMM".equalsIgnoreCase("maxim"));
	}
	
	
	@Test
	void testIndexOf() {
		String res = "Maxim";
		assertEquals(-1, res.indexOf("w"));//индекс первого значения  которое повторяется
		assertEquals(0, res.indexOf("M"));
		assertEquals(3, res.indexOf("im"));
		assertEquals(-1, res.indexOf("Maxim1"));
		assertEquals(0, res.indexOf("Maxim"));
	}
	
	@Test
	void testLastIndexOf() {
		String res = "maxim";
		assertEquals(4, res.lastIndexOf("m"));//индекс последнего значения  которое повторяется
		assertEquals(-1, res.lastIndexOf("M"));
		assertEquals(0, res.indexOf("maxim"));
	}
	

	

}