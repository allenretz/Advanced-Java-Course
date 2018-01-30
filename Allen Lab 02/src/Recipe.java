import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

//https://docs.oracle.com/javase/8/docs/api/java/io/PrintWriter.html

public class Recipe {
	public void getRecipe() {
		Scanner scan = new Scanner(System.in);
		PrintWriter fileW;
		ArrayList<String> textLines = new ArrayList<String>();
		
		textLines.add("Ingredients:");
		
		String in = "Not Blank";
		while (! in.isEmpty() ) {
			System.out.print("Please Enter an Ingredient ");
			in = scan.nextLine();
			if (! in.isEmpty()) {
				textLines.add(in);
			}
			
		}
		textLines.add("");
		textLines.add("");
		textLines.add("Directions:");
		
		in = "Not Blank";
		while (! in.isEmpty() ) {
			System.out.print("Please Enter a Direction ");
			in = scan.nextLine();
			if (! in.isEmpty()) {
				textLines.add(in);
			}
			
		}
		
		System.out.println("Please Enter a Recipe Name ");
		try {
			fileW = new PrintWriter(scan.nextLine() + ".txt");
			for (int i = 0; i < textLines.size(); i++) {
				fileW.println(textLines.get(i));
			}
			fileW.close();
		} catch (FileNotFoundException e) {
			System.err.println("You Messed Up! We are not writing your file.");
		}
		
		scan.close();
		
	}
}
