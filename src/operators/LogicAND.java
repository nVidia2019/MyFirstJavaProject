package operators;

public class LogicAND {
	
	public static void main(String[] args) {
		
		int age = 18;
		String name = "John";
		String weather = "rainy";
		boolean check = (age >= 21) & (name == "James");
		System.out.println(check);
		// Java still checks name, although it doesn't impact the result
		
		boolean check2 = (age >= 21) && ((name = "Adam") == "James");
		System.out.println(name);
		System.out.println(check2);
		// the name result is John, because Java didn't check the second part of comparison
		
		boolean check3 = (age >= 21) & ((name = "Adam") == "James");
		System.out.println(name);
		System.out.println(check3);
		// the name result is Adam, because Java didn't check the second part of comparison
	}
}
