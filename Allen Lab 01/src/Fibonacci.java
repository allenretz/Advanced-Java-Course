import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

public class Fibonacci {
	Map<Integer, BigInteger> dictionary = new HashMap<Integer,BigInteger>();
	public BigInteger getFibonacci(int n) {
		if (n == 0 || n == 1) {
			return new BigInteger("1");
		} else if (! dictionary.containsKey(n)) {
			dictionary.put(n, getFibonacci(n-2).add(getFibonacci(n-1)));
		}
		return dictionary.get(n);
	}
}
