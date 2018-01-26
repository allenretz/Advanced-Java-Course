import java.io.*;

public class FileReaderExample {

	public static void main(String[] args) {
		
		FileReader fr;
		try {
			fr = new FileReader("C:\\Users\\allen4\\Desktop\\garbage.txt");int text = fr.read();
			while(fr.ready()) {
				System.out.print((char) text);
				text = fr.read();
			}
		} catch (IOException e) {}
		
			

	}

}
