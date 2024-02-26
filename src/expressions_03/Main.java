package expressions_03;

public class Main {

	public static void main(String[] args) {
		// Expression = operands & operators
		// Operands = values, variables, numbers, quantity
		// Operators = + - * / %
		
		int friends = 10;
		
		// friends = friends + 1;
		friends++;
		
		System.out.println(friends);
		
		// friends = friends - 1;
		friends--;
		
		System.out.println(friends);
		
		// friends = friends / 2;
		friends /= 2;
		
		System.out.println(friends);
		
		// friends = friends * 2;
		friends *= 2;
		
		System.out.println(friends);
		
		// friends = friends % 2;
		friends %= 2;
		
		System.out.println(friends);
		
		friends = 10;
		
		double doubleFriends = (double) friends / 3;
		
		System.out.println(doubleFriends);
		
		
	}

}
