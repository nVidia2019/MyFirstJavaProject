package inputs;

import java.util.Scanner;

public class Profile {
	
	public static void main(String[] args) {
		System.out.println("Welcome to my Program!");
		String firstName;
		String lastName;
		int age;
		String location;
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your first name: ");
		firstName = input.nextLine();
		System.out.println("Welcome back, " + firstName + "!");
		System.out.println("Please enter your last name: ");
		lastName = input.nextLine();
		System.out.println("Last name: " + lastName);
		System.out.println("Please enter your location: ");
		location = input.nextLine();
		System.out.println("Your location: " + location);
		System.out.println(firstName + ", how old are you?");
		age = input.nextInt();
		System.out.println("Your age: " + age); // test comment: change for GitHub;
	 	
	}

}
