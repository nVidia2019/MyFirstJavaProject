package ifElseStatements;

public class Phone {
	public static void main(String[] args) {
		String color = "Grey";
		int memory = 128;
		String model = "IPhone X";
		System.out.println("Color is changing to Gold");
		color = "Gold";
		int size = color.length();
		memory = 512;
		
		if (memory >= 512) {
			System.out.println("Good phone");
		}
		else {
			System.out.println("Okey phone");
		}
	}
}
