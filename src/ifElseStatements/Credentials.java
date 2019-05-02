package ifElseStatements;

import java.util.Scanner;

public class Credentials {
	public static void main(String[] args) {
		String username = "test";
		String password = "test123";
		
		System.out.println("Welcome!");
		Scanner input = new Scanner(System.in);
		System.out.println("\nEnter your username:");
		String enteredUsername = input.nextLine();		
		System.out.println("Enter your password:");
		String enteredPassword = input.nextLine();
		
		if (enteredUsername.equals(username) && enteredPassword.equals(password)) {
			System.out.println("Welcome, " + enteredUsername + "!!!");
		}
		else if (enteredUsername.equals(username) && !enteredPassword.equals(password)) {
			System.out.println("Invalid password");
		}
		else if (!enteredUsername.equals(username) && enteredPassword.equals(password)) {
			System.out.println("Invalid username");
	}
		else 
		{
			System.out.println("Invalid credentials");
		}
}
}