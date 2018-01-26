import java.io.InputStreamReader;

public class IOStream_1 {
	public static void main(String[] args) {
		//Input Stream Reader -- simple underlying general code for Scanner
		System.out.print("Enter some text: ");
		InputStreamReader isr = new InputStreamReader(System.in);
		try {
			int letters = isr.read();
			System.out.println(isr.ready());
			System.out.print("You said: ");
			while(isr.ready()) {
				System.out.print((char) letters);
				letters = isr.read();
			}
			isr.close();
		}catch(Exception e) {
			
		}
	}
}
