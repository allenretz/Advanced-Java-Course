package JUnitStuff;

import static org.junit.Assert.*;

import org.junit.Test;

public class KitchenSinkTests {
	
	@Test
	public void greetTestEquals() {
		KitchenSink ks = new KitchenSink();
		
		String name = "Allen";
		String greeting = ks.greet(name);
		String expected = "Hello, Allen!";
		
		assertEquals(expected, greeting);
	}
	
	@Test
	public void greetLengthTest() {
		KitchenSink ks = new KitchenSink();
		
		String name = "Allen";
		long greeting = (long) ks.greet(name).length();
		long expected = (long) 13;
		
		assertEquals(expected, greeting);
	}
	
	/*@Test
	public void greetTestDoesNotEqual() {
		KitchenSink ks = new KitchenSink();
		
		String name = "Allen";
		String greeting = ks.greet(name);
		String expected = "Hello";
		
		assertNotEquals(expected, greeting);
	}*/
	
	@Test
	public void greetLoudlyTest() {
		KitchenSink ks = new KitchenSink();
		
		String name = "Allen";
		String greeting = ks.greetLoudly(name);
		String expected = "HELLO, ALLEN!";
		
		assertEquals(expected, greeting);
	}
	
	@Test
	public void intLogTest() {
		KitchenSink ks = new KitchenSink();
		long expected = (long) 4;
		int input = 4505;
		long actual =  ks.intLog(input);
		assertEquals(expected, actual);
	}
	
	@Test
	public void intLogTest2() {
		KitchenSink ks = new KitchenSink();
		long expected = (long) 5;
		int input = 45051;
		long actual =  ks.intLog(input);
		assertEquals(expected, actual);
	}
	
	

}
