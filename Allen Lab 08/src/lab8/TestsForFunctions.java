package lab8;

import static org.junit.Assert.*;

import org.junit.Test;

import java.util.ArrayList;
import java.util.stream.*;

public class TestsForFunctions {
	@Test
	public void addInts_positiveNumbers() {
		FunctionsToTest f = new FunctionsToTest();
		
		int x        = 5;
		int y        = 3;
		int expected = 8;
		int actual   = f.addInts(x, y);
		
		assertEquals(expected,actual);
	}
	
	@Test
	public void addInts_negativeNumbers() {
		FunctionsToTest f = new FunctionsToTest();
		
		int x        = -2;
		int y        = -1;
		int expected = -3;
		int actual   = f.addInts(x, y);
		
		assertEquals(expected,actual);
	}
	
	@Test
	public void addInts_overflow() {
		FunctionsToTest f = new FunctionsToTest();
		
		int x        = 2147483647;
		int y        = 1;
		int expected = -2147483648;
		int actual   = f.addInts(x, y);
		
		assertEquals(expected,actual);
	}
	
	@Test
	public void addInts_notEqual() {
		FunctionsToTest f = new FunctionsToTest();
		
		int x        = 5;
		int y        = 3;
		int badValue = 2;
		int actual   = f.addInts(x, y);
		
		assertFalse(badValue == actual);
	}
	
	@Test
	public void addString_length() {
		FunctionsToTest f = new FunctionsToTest();
		
		String x     = "abc_";
		String y     = "defg";
		int expected = 8;
		int actual   = f.addString(x, y).length();
		
		assertEquals(expected, actual);
	}
	@Test
	public void addString_notEquals() {
		FunctionsToTest f = new FunctionsToTest();
		
		String x        = "abc_";
		String y        = "defg";
		String badValue = "abcdefg";
		String actual   = f.addString(x, y);
		
		assertFalse(badValue == actual);
	}
	
	@Test
	public void findLen_regular() {
		FunctionsToTest f = new FunctionsToTest();
		
		String x     = "abc_";
		int expected = 4;
		int actual   = f.findLen(x);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void findLen_empty() {
		FunctionsToTest f = new FunctionsToTest();
		
		String x     = "";
		int expected = 0;
		int actual   = f.findLen(x);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void findLen_badValue() {
		FunctionsToTest f = new FunctionsToTest();
		
		String x     = "abc_";
		int badValue = 3;
		int actual   = f.findLen(x);
		
		assertFalse(badValue == actual);
	}
	
	@Test
	public void divXbyY_returnIsInt() {
		FunctionsToTest f = new FunctionsToTest();
		
		int x           = 6;
		int y           = 2;
		Object actual   = f.divXbyY(x,y);

		assertTrue(actual instanceof Integer);
	}
	
	@Test
	public void divXbyY_noRemainder() {
		FunctionsToTest f = new FunctionsToTest();
		
		int x        = 6;
		int y        = 2;
		int expected = 3;
		int actual   = f.divXbyY(x,y);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void divXbyY_truncatedRemainder() {
		FunctionsToTest f = new FunctionsToTest();
		
		int x        = 7;
		int y        = 2;
		int expected = 3;
		int actual   = f.divXbyY(x,y);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void divXbyY_noDecimal() {
		FunctionsToTest f = new FunctionsToTest();
		
		int x           = 7;
		int y           = 2;
		double badValue = 3.5;
		double actual   = f.divXbyY(x,y);
		
		assertFalse(badValue == actual);
	}
	
	@Test
	public void reverseIntArray_sum() {
		FunctionsToTest f = new FunctionsToTest();
		
		int[] arr    = {1,2,3,4,10};
		long expected = IntStream.of(arr).asLongStream().sum();  // https://stackoverflow.com/a/17846344
		
		long actual   = IntStream.of(f.reverseIntArray(arr)).asLongStream().sum();
		assertEquals(expected, actual);
	}
	
	@Test
	public void reverseIntArray_notSame() {
		FunctionsToTest f = new FunctionsToTest();
		
		int[] arr      = {1,2,3,4,10};
		int[] badValue = arr.clone();
		
		int[] actual   = f.reverseIntArray(arr);
		assertFalse(badValue == actual);
	}
	
	@Test
	public void range_singlePositiveValue() {
		FunctionsToTest f = new FunctionsToTest();
		
		int x  = 5;
		
		int[] tmpArr = new int[] {0,1,2,3,4};
		ArrayList<Integer> expected = new ArrayList<Integer>();
		for (int i : tmpArr) {
			expected.add(i);
		}
		ArrayList<Integer> actual = f.range(x);
		assertTrue(expected.equals(actual));
	}
	
	@Test
	public void range_singleZero() {
		FunctionsToTest f = new FunctionsToTest();
		
		int x  = 0;
		
		ArrayList<Integer> expected = new ArrayList<Integer>();
		ArrayList<Integer> actual = f.range(x);
		assertTrue(expected.equals(actual));
	}
	
	@Test
	public void range_singleNegativeValue() {
		FunctionsToTest f = new FunctionsToTest();
		
		int x  = -3;
		
		int[] tmpArr = new int[] {0,-1,-2};
		ArrayList<Integer> expected = new ArrayList<Integer>();
		for (int i : tmpArr) {
			expected.add(i);
		}
		ArrayList<Integer> actual = f.range(x);
		assertTrue(expected.equals(actual));
	}
	@Test
	public void range_twoPositiveAscendingValues() {
		FunctionsToTest f = new FunctionsToTest();
		
		int x  = 2;
		int y  = 9;
		
		int[] tmpArr = new int[] {2,3,4,5,6,7,8};
		ArrayList<Integer> expected = new ArrayList<Integer>();
		for (int i : tmpArr) {
			expected.add(i);
		}
		ArrayList<Integer> actual = f.range(x,y);
		assertTrue(expected.equals(actual));
	}
	
	@Test
	public void range_twoPositiveDesendingValues() {
		FunctionsToTest f = new FunctionsToTest();
		
		int x  = 7;
		int y  = 1;
		
		int[] tmpArr = new int[] {7,6,5,4,3,2};
		ArrayList<Integer> expected = new ArrayList<Integer>();
		for (int i : tmpArr) {
			expected.add(i);
		}
		ArrayList<Integer> actual = f.range(x,y);
		assertTrue(expected.equals(actual));
	}
	
	@Test
	public void range_twoNegativeAscendingValues() {
		FunctionsToTest f = new FunctionsToTest();
		
		int x  = -4;
		int y  = -2;
		
		int[] tmpArr = new int[] {-4, -3};
		ArrayList<Integer> expected = new ArrayList<Integer>();
		for (int i : tmpArr) {
			expected.add(i);
		}
		ArrayList<Integer> actual = f.range(x,y);
		assertTrue(expected.equals(actual));
	}
	
	@Test
	public void range_twoNegativeDecendingValues() {
		FunctionsToTest f = new FunctionsToTest();
		
		int x  = -3;
		int y  = -8;
		
		int[] tmpArr = new int[] {-3, -4, -5, -6, -7};
		ArrayList<Integer> expected = new ArrayList<Integer>();
		for (int i : tmpArr) {
			expected.add(i);
		}
		ArrayList<Integer> actual = f.range(x,y);
		assertTrue(expected.equals(actual));
	}
	
	@Test
	public void range_zeroAndPositive() {
		FunctionsToTest f = new FunctionsToTest();
		
		int x  = 0;
		int y  = 7;
		
		int[] tmpArr = new int[] {0, 1, 2, 3, 4, 5, 6};
		ArrayList<Integer> expected = new ArrayList<Integer>();
		for (int i : tmpArr) {
			expected.add(i);
		}
		ArrayList<Integer> actual = f.range(x,y);
		assertTrue(expected.equals(actual));
	}
	
	@Test
	public void range_positiveAndZero() {
		FunctionsToTest f = new FunctionsToTest();
		
		int x  = 11;
		int y  = 0;
		
		int[] tmpArr = new int[] {11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
		ArrayList<Integer> expected = new ArrayList<Integer>();
		for (int i : tmpArr) {
			expected.add(i);
		}
		ArrayList<Integer> actual = f.range(x,y);
		assertTrue(expected.equals(actual));
	}
	
	@Test
	public void range_zeroAndNegative() {
		FunctionsToTest f = new FunctionsToTest();
		
		int x  = 0;
		int y  = -8;
		
		int[] tmpArr = new int[] {0, -1, -2, -3, -4, -5, -6, -7};
		ArrayList<Integer> expected = new ArrayList<Integer>();
		for (int i : tmpArr) {
			expected.add(i);
		}
		ArrayList<Integer> actual = f.range(x,y);
		assertTrue(expected.equals(actual));
	}
	
	@Test
	public void range_negativeAndZero() {
		FunctionsToTest f = new FunctionsToTest();
		
		int x  = -4;
		int y  = 0;
		
		int[] tmpArr = new int[] {-4, -3, -2, -1};
		ArrayList<Integer> expected = new ArrayList<Integer>();
		for (int i : tmpArr) {
			expected.add(i);
		}
		ArrayList<Integer> actual = f.range(x,y);
		assertTrue(expected.equals(actual));
	}
	
	@Test
	public void range_twoSamePositiveValues() {
		FunctionsToTest f = new FunctionsToTest();
		
		int x  = 4;
		int y  = 4;
		ArrayList<Integer> expected = new ArrayList<Integer>();
		ArrayList<Integer> actual = f.range(x,y);
		assertTrue(expected.equals(actual));
	}
	
	@Test
	public void range_twoZeroValues() {
		FunctionsToTest f = new FunctionsToTest();
		
		int x  = 0;
		int y  = 0;
		ArrayList<Integer> expected = new ArrayList<Integer>();
		ArrayList<Integer> actual = f.range(x,y);
		assertTrue(expected.equals(actual));
	}
	
	@Test
	public void range_twoSameNegativeValues() {
		FunctionsToTest f = new FunctionsToTest();
		
		int x  = -1;
		int y  = -1;
		ArrayList<Integer> expected = new ArrayList<Integer>();
		ArrayList<Integer> actual = f.range(x,y);
		assertTrue(expected.equals(actual));
	}
	
	@Test
	public void range_negativePositive() {
		FunctionsToTest f = new FunctionsToTest();
		
		int x  = -3;
		int y  = 7;
		int[] tmpArr = new int[] {-3, -2, -1, 0, 1, 2, 3, 4, 5, 6};
		ArrayList<Integer> expected = new ArrayList<Integer>();
		for (int i : tmpArr) {
			expected.add(i);
		}
		ArrayList<Integer> actual = f.range(x,y);
		assertTrue(expected.equals(actual));
	}
	
	@Test
	public void range_positiveNegative() {
		FunctionsToTest f = new FunctionsToTest();
		
		int x  = 5;
		int y  = -3;
		int[] tmpArr = new int[] {5, 4, 3 ,2, 1, 0, -1, -2};
		ArrayList<Integer> expected = new ArrayList<Integer>();
		for (int i : tmpArr) {
			expected.add(i);
		}
		ArrayList<Integer> actual = f.range(x,y);
		assertTrue(expected.equals(actual));
	}
	
	@Test
	public void range_StepPositive() {
		FunctionsToTest f = new FunctionsToTest();
		
		int x  = 5;
		int y  = 10;
		int z  = 2;
		int[] tmpArr = new int[] {5, 7, 9};
		ArrayList<Integer> expected = new ArrayList<Integer>();
		for (int i : tmpArr) {
			expected.add(i);
		}
		ArrayList<Integer> actual = f.range(x,y,z);
		assertTrue(expected.equals(actual));
	}
	
	@Test(expected=IllegalArgumentException.class) // https://junit.org/junit4/faq.html#atests_7
	public void range_StepZero() {
		FunctionsToTest f = new FunctionsToTest();
		
		int x  = 5;
		int y  = 10;
		int z  = 0;
		f.range(x,y,z);
	}
	
	@Test
	public void range_StepNegative() {
		FunctionsToTest f = new FunctionsToTest();
		
		int x  = 11;
		int y  = 4;
		int z  = -3;
		int[] tmpArr = new int[] {11, 8, 5};
		ArrayList<Integer> expected = new ArrayList<Integer>();
		for (int i : tmpArr) {
			expected.add(i);
		}
		ArrayList<Integer> actual = f.range(x,y,z);
		assertTrue(expected.equals(actual));
	}
	
	@Test
	public void range_StepPositiveWhileDecending() {
		FunctionsToTest f = new FunctionsToTest();
		
		int x  = 11;
		int y  = 4;
		int z  = 3;
		ArrayList<Integer> expected = new ArrayList<Integer>();
		ArrayList<Integer> actual = f.range(x,y,z);
		assertTrue(expected.equals(actual));
	}
	@Test
	public void range_StepNegativeWhileAscending() {
		FunctionsToTest f = new FunctionsToTest();
		
		int x  = 3;
		int y  = 12;
		int z  = -4;
		ArrayList<Integer> expected = new ArrayList<Integer>();
		ArrayList<Integer> actual = f.range(x,y,z);
		assertTrue(expected.equals(actual));
	}
	
}
