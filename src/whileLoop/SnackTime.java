package whileLoop;

public class SnackTime {
public static void main(String[] args) {
	boolean hungry = true;
	int apples = 1;
	
	while (hungry) {
		System.out.print("Eating an apple ");
		System.out.println(apples);
		if (apples == 5) {
			hungry = false;
				}
		else {
		apples++; // <=== this update has to be at the end of loop body in order for it to execute correctly
	}
	}
	System.out.println("Apples: " + apples);
	System.out.println("Hungry: " + hungry);
}
}
