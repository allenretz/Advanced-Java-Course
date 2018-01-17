import java.util.Scanner;
public class VolumeofSphere {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter A Radius in Meters (m): ");
		double r = input.nextDouble();
		
		System.out.println();
		
		double volume = (4.0 / 3.0) * Math.PI * Math.pow(r, 3);
		
		System.out.printf("The volume of the sphere with radius %.2f (m) is %.3f (m^3) \n", r,volume);
		

	}

}
