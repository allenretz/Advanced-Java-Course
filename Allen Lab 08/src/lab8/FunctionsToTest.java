package lab8;

import java.util.ArrayList;

public class FunctionsToTest {
	public int addInts(int x, int y) {
		return x + y;
	}
	public String addString(String x, String y) {
		return x + y;
	}
	
	public int findLen(String x) {
		return x.length();
	}
	
	public int divXbyY(int x, int y) {
		return x / y;
	}
	
	public int[] reverseIntArray(int[] arr){
		int[] ret = arr.clone();
		for (int i = 0; i < arr.length; i ++) {
			ret[i] = arr[arr.length - i - 1];
		}
		return ret;
	}
	
	public ArrayList<Integer> range(int x) {
		if (x >= 0) {
			return range(0,x,1);
		}else {
			return range(0,x,-1);
		}
	}
	
	public ArrayList<Integer> range(int x, int y) {
		if (y >= x) {
			return range(x,y,1);
		}else {
			return range(x,y,-1);
		}
	}
	
	public ArrayList<Integer> range(int x, int y, int z) {
		if (z == 0) {
			throw new IllegalArgumentException("z can not equal Zero");
		}
		ArrayList<Integer> rng = new ArrayList<Integer>();
		int i = x;
		if (Math.abs(x + z - y )> Math.abs(x-y)) { // if z is in the opposite direction of y from x, return empty
			return rng;
		}
		if (z >= 0) {	
			while(i < y) {
				rng.add(i);
				i += z;
			}
		} else {
			while(i > y) {
				rng.add(i);
				i += z;
			}
		}
		
		return rng;
	}


}
