package userInput_02;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("What is your name?");
		String name = scanner.nextLine();
		System.out.println("How old are you?");
		int age = scanner.nextInt();
		System.out.println("What is your favorite food?");
		scanner.nextLine(); // You need to call .nextLine method after calling .nextInt method
		String food = scanner.nextLine();
		
		System.out.println("Hello " + name);
		System.out.println("You are " + age);
		System.out.println("Your like " + food);
		
	}

}
