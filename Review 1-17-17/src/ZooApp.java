
public class ZooApp {

	public static void main(String[] args) {
		Zoo z = new Zoo();
		int x = 0;
		while (x < 40) {
			z.advance();
			x++;
		}

	}

}
