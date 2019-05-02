package methods;

public class Cooking {
	public static void main(String[] args) {
		cook("pasta");
		youWillNeed("pasta, salt and sauce");
		cookFor(8, "boiling");
		ready();
	}
	
	public static void cook(String foodName) { 
	System.out.println("Today we are cooking " + foodName + ".");
}
	public static void youWillNeed(String ingredients) { 
	System.out.println("We will need following ingredients: " + ingredients + ".");
}
	public static void cookFor(int min, String wayOfCooking) { 
	System.out.println("You need to cook for " + min + " minutes, by " + wayOfCooking + ".");
}
	public static void ready() {
		System.out.println("The dinner is ready. Enjoy!");
}
	
}

