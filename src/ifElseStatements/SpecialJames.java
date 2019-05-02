package ifElseStatements;

import java.util.Scanner;

public class SpecialJames {
public static void main(String[] args) {
	System.out.println("What is you name?");
	Scanner input = new Scanner(System.in);
	String name = input.nextLine();
	String lastName;

	if (name.equalsIgnoreCase("James")) { //method "equalsIgnoreCase" --> compares ignoring Upper or Lower case
		System.out.println("What is your last name?");
		lastName = input.nextLine();
	}
	else {
		lastName = "Nobody";
	}
	System.out.println("Hello " + name + " " + lastName);
}
}
