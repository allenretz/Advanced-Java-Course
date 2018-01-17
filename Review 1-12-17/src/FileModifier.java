import java.io.*;
import java.nio.file.*;

public class FileModifier {

	public static void main(String[] args) {
		// I could not remember how to read from or manipulate a file
		// so I referenced https://docs.oracle.com/javase/tutorial/essential/io/file.html
		System.out.println(System.getProperty("user.dir"));
		Path pathToFile = Paths.get("./file.txt");
		try (InputStream in = Files.newInputStream(pathToFile);
		    BufferedReader reader =
		      new BufferedReader(new InputStreamReader(in))) {
		    String line = null;
		    int lineCount = 1;
		    while ((line = reader.readLine()) != null) {
		        System.out.println("" + lineCount++ + " " + line);
		    }
		} catch (IOException x) {
		    System.err.println(x);
		}

	}

}
