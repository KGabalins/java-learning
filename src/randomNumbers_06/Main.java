package randomNumbers_06;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		
		Random random = new Random();
		
		int x = random.nextInt(6) + 1; // Works like a dice. Need to add + 1, because random starts counting from 0
		System.out.println(x);
		
		double y = random.nextDouble();
		System.out.println(y);
		
		boolean z = random.nextBoolean();
		
		System.out.println(z);

	}

}
