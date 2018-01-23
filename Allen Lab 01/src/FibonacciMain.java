import java.util.Scanner;

public class FibonacciMain {

	public static void main(String[] args) {
		Fibonacci f = new Fibonacci();
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		for(int i = 0; i < n; i ++) {
			System.out.println(f.getFibonacci(i));
		}

	}

}
