
public class Factorial {
	int x = 0;

	public Factorial() {
		x = 10;
	}

	public Factorial(int n) {
		x = n;
	}

	public int findFactorial() {
		return findFactorial(x);
	}

	public int findFactorial(int n) {
		if (n == 1) {
			return 1;
		} else {
			return n * findFactorial(n - 1);
		}
	}
}
