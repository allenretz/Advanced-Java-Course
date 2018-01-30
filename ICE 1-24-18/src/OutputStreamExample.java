import java.io.*;

public class OutputStreamExample {
	public static void main(String[] args) {
		try {
		FileWriter fw = new FileWriter("Example.txt");
		fw.write("First line of the text file.\r\n");
		//fw.write('\n');
		fw.write("Second line of th eText file.\r\n");
		//fw.write('\n');
		fw.close();
		}
		catch(IOException e) {}
	}
}
