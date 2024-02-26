package oracle_excercises;

public class oop {
	
	public static void main(String[] args) {
		WaterBottle waterBottle = new WaterBottle(0.5f);
		
		waterBottle.drinkWater(0.2f);
		waterBottle.closeBottle();
		waterBottle.openBottle();
		waterBottle.drinkWater(0.2f);
		waterBottle.drinkWater(0.2f);
		waterBottle.drinkWater(0.2f);
		waterBottle.drinkWater(0.2f);
		waterBottle.openBottle();
		waterBottle.closeBottle();
		waterBottle.drinkWater(0.2f);
		waterBottle.refillBottle(0.6f);
		waterBottle.openBottle();
		waterBottle.refillBottle(0.6f);
		waterBottle.refillBottle(0.6f);
	}
	
	public static class WaterBottle {
		private float totalVolume;
		private float currentVolume;
		private boolean isOpened;
		
		// Constructor
		public WaterBottle(float totalVolume) {
			this.totalVolume = totalVolume;
			this.currentVolume = totalVolume;
			this.isOpened = false;
		}
		
		public void drinkWater(float drinkAmount) {
			if(isOpened) {
				if (currentVolume == 0f) {
					System.out.println("The water bottle is empty, there is nothing to drink!");
				} else if(drinkAmount > currentVolume) {
					System.out.println("You just drank " + currentVolume + "L amount of water. The bottle is empty now.");
					currentVolume = 0f;
				} else {
					currentVolume -= drinkAmount;
					System.out.println("You just drank " + drinkAmount + "L amount of water. The bottle still has " + currentVolume + "L.");
				}
			} else {
				System.out.println("You have to open the water bottle, before you can drink form it!");
			}
		}
		
		public void refillBottle(float amount) {
			if (isOpened) {
				if (amount > totalVolume - currentVolume) {
					float leakedVolume = amount - (totalVolume - currentVolume);
					currentVolume = totalVolume;

					System.out.println("Your water bottle was fully filled (" + totalVolume + "L). But you leaked " + leakedVolume + "L of water.");
				} else {
					currentVolume += amount;
					System.out.println("You just reffiled you water bottle to " + currentVolume + "L");
				}
			} else {
				System.out.println("You cannot refill a closed water bottle!");
			}
		}
		
		public void openBottle() {
			if(isOpened) {
				System.out.println("The water bottle is already opened!");
			} else {
				isOpened = true;
				System.out.println("You just opened the water bottle!");
			}
		}
		
		public void closeBottle() {
			if(!isOpened) {
				System.out.println("The water bottle is already closed!");
			} else {
				isOpened = false;
				System.out.println("You just closed the water bottle!");
			}
		}
		
		public void displayData() {
			System.out.println("Water bottle's total volume is: " + totalVolume + "L");
			System.out.println("Water bottle's current volume is: " + currentVolume + "L");
			if(isOpened) {
				System.out.println("The water bottle is oppened");
			} else {
				System.out.println("The water bottle is closed");
			}
		}
	}

}
