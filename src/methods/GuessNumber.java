package methods;

import java.util.*;

public class GuessNumber {
public static void main(String[] args) { // computer picks a random number up to 20 and tries to guess it randomly
	int times = 5;
	playGuessNumComputerOnly(times);
}

public static void playGuessNumComputerOnly (int times) {
	Random random = new Random();
	int secretNumber = random.nextInt(21);
	int counter = 0;
	do {
		System.out.println("Guess the secret number.");
		int guessNumber = random.nextInt(21);
		System.out.println("Computer guess is: " + guessNumber);
		if (guessNumber == secretNumber) {
			System.out.println("You won! Guessed the sercet number.");
			System.out.println("The secret number was: " + secretNumber);
			System.out.println("The number of tries was " + times + ".");
			break;
		}else {System.out.println("Wrong! Try again.");
			counter +=1;
		}
		if (counter == times) {
			System.out.println("All " + times + " tries have been used.");
		}
	}while(true);
}
}
