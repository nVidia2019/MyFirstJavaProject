package staticPractice;

public class AtRestaurant {
	public static void main(String[] args) {
		Dinner dad = new Dinner();
		Dinner mom = new Dinner();
		Dinner kid = new Dinner();
		
		System.out.println("Pizza slice: " + dad.pizzaSlices);	
		
		dad.takeASlice(2);
		kid.takeASlice(3);
		mom.takeASlice();
		System.out.println("Pizza slice: " + mom.pizzaSlices);
	}
	
}
