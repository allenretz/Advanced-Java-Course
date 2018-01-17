
public class IsPrime {

	public static void main(String[] args) {
		
		for (int i = 1; i < 50; i++) {
			boolean isPrime = true;
			if (i == 1){ System.out.println("1 is NOT Prime"); }
			else {
				/* The Slow way ( I could have been dynamic and created an ArrayList
				 * of previous primes, but up to 50, this works quickly)
				 */
				
				for (int j = 2; j < i; j++) {
					if (i % j == 0) { isPrime = false; }
				}
				if (isPrime){ System.out.println("" + i + " is Prime"); }
				else        { System.out.println("" + i + " is NOT Prime"); }
			}
		}

	}

}
