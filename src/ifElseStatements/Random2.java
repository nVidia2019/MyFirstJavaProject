package ifElseStatements;

import java.util.Random;
import java.util.Scanner;

public class Random2 {
	public static void main(String[] args) {
		
	Random random = new Random ();
	int randomNumber = random.nextInt(11);
	Scanner input = new Scanner(System.in);
	boolean guess = false;
	
	System.out.println("Please try to guess a number between 0 to 10");
	int userNumber = input.nextInt();
	
	if (randomNumber == userNumber) {
		guess = true;
		System.out.println("Congratulations! You have guessed the number!");
	}
	else if (randomNumber > userNumber) {
		System.out.println("Your number is too low");
	}
	else {
		System.out.println("Your number is too high");
	}
	System.out.println("Guess: " + guess);
	if (guess == false) { //guess is "false" so we need to make sure it's "true" in order to give user 2nd chance --> (!false)
	// if statement MUST BE TRUE in order the statement to execute
		System.out.println("This is your last chance. Please guess the number");
		int userNumber2 = input.nextInt();
		if(userNumber2 == randomNumber) {
			System.out.println("Congrats!");
		}
		else {
			System.out.println("Lost!");
		}
	}
	System.out.println("Number was: " + randomNumber);
	
}
}
