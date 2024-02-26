package oracle_excercises;

public class inheritance {

	public static void main(String[] args) {
		
		Car oldCar = new Car();
		
		oldCar.display();
		oldCar.switchGears(1);
		oldCar.increaseSpeed(40f);
		oldCar.display();
		oldCar.switchGears(0);
		oldCar.applyBreaks(50f);
		oldCar.display();
		
		ModernCar newCar = new ModernCar();
		
		newCar.display();
		newCar.switchGears(1);
		newCar.increaseSpeed(40f);
		newCar.display();
		newCar.switchGears(0);
		newCar.applyBreaks(50f);
		newCar.display();
		newCar.switchRadio();
	}
	
	public static class Car {
		float speed;
		int gear;
		
		public void increaseSpeed(float amount) {
			System.out.println("Increasing the driving speed from " + speed + " to " + (speed + amount));
			speed += amount;
			}
		
		public void applyBreaks(float amount) {
			if (amount > speed) {
				amount = speed;
			}

			System.out.println("Decreasing the driving speed from " + speed + " to " + (speed - amount));
			speed -= amount;
		}
		
		public void switchGears(int switchGear) {
			if(gear < 0 || gear > 6) {
				System.out.println("There are only 6 gears, and a neutral gear - 0");
			} else if (switchGear == 0) {
				gear = switchGear;
				System.out.println("Switching gear to neutral");
			} else {
				gear = switchGear;
				System.out.println("Switching to gear nr. " + gear);
			}
		}
		
		public void display() {
			System.out.println("Current speed: " + speed);
			System.out.println("Current gear: " + gear);
		}
	}
	
	public static class ModernCar extends Car{
		boolean radioOn = false;
		
		public void switchRadio() {
			radioOn = !radioOn;
			if(radioOn) {
				System.out.println("Radio has been turned on");
			} else {
				System.out.println("Radio has been turned off!");
			}
		}
	}

}
