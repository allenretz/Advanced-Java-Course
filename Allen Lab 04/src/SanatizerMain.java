import java.util.Scanner;

public class SanatizerMain {
	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String inpt = scan.nextLine();
		while (! inpt.equals("")){
			System.out.println( Sanatizer.isSafe(inpt)? "Safe" : "Unsafe" );
			inpt = scan.nextLine();
			
			
			
		}
		
		scan.close();
	}
}
