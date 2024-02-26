package mathClass_05;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		double x = 3.14;
		double y = -10;
		
		// Returns the biggest number
		double zmax = Math.max(x, y);
		
		System.out.println(zmax);

		// Returns the smallest number
		double zmin = Math.min(x, y);
		
		System.out.println(zmin);
		
		// Return the square root of x
		double zsqrt = Math.sqrt(x);

		System.out.println(zsqrt);
		
		// Rounds the x
		double zround = Math.round(x);

		System.out.println(zround);
		
		// Always rounds the number up
		double zceil = Math.ceil(x);

		System.out.println(zceil);
		
		// Always rounds the number down
		double zfloor = Math.floor(x);

		System.out.println(zfloor);
		
		// Hypotenuse excersie
		
		double a;
		double b;
		double c;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter side a: ");
		a = scanner.nextDouble();
		System.out.println("Enter side b: ");
		b = scanner.nextDouble();
		
		c = Math.sqrt((a*a)+(b*b));
		
		System.out.println("The hypotenuse is " + c);
		
		scanner.close();

	}

}
