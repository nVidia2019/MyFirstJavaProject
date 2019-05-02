package ifElseStatements;

import java.util.Scanner;

public class Profile {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please create your password:");
		String enteredPassword = input.nextLine();
		int numberOfSymbols = enteredPassword.length();
		
	
		if (numberOfSymbols >=5 && numberOfSymbols <= 12)
		{
		System.out.println("Your password has been created!");
		}
		else {   //nested if else statement
					if (numberOfSymbols < 5) {		
					System.out.println("Password length is too short");
					}
		
					else {
					System.out.println("Password length is too long");
					}	
			}
	}
}

