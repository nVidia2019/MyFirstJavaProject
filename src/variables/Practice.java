package variables;

import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		System.out.println("Hello! What's your name?");
		Scanner input = new Scanner(System.in);
		String name = input.nextLine();
		System.out.println("Great, " + name + "! " + "How old are you?");
		int age = input.nextInt();
		System.out.println("So you will be " + (age + 5) + " in 5 years.");
		System.out.println("What's your address?");
		String address = input.nextLine();
		System.out.println("So your package will be sent to: " + address + ". Have a good day!");
	}
}
