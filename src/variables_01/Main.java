package variables_01;

public class Main {

	public static void main (String[] args) {
		
		/*
		 * 		int x; // Declaration
		 *		x = 123; // Assignment
		 */

		int x = 123; // Initialization
		
		System.out.println(x);
		System.out.println("My number is: " + x);
		
		// int y = 1231231231231231231  // Too Large for int
		
		long y = 1231231231231231231L; // Initialize a long variable and follow it with letter L
		
		System.out.println(y);
		
		float z = 3.1415926f; // Float variables have to follow with the letter f, and can only hold 7 decimal numbers
	
		System.out.println(z);
		
		double v = 3.14159265359;
		
		System.out.println(v);
				
		boolean isAtWork = true; 
		
		System.out.println(isAtWork);
		
		char symbol = '@';
		
		System.out.println(symbol);
		
		String name = "Karlis";
		
		System.out.println(name);
		System.out.println("Hello " + name);
	} 
	
}
