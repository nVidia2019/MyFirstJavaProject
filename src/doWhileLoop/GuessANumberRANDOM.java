package doWhileLoop;

import java.util.Random;
import java.util.Scanner;

public class GuessANumberRANDOM {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);	
	Random random = new Random(); // Random doesn't like negative numbers, it can be used with Double, but you can't set the range.
	// to print random number: System.out.println(random.nextInt(50)) <== 50 is NOT included in the range
	int secretNumber = random.nextInt(101);
	int guessedNumber;
	int iTries = 0;
	
	do {
		System.out.println("Guess the number between 0 and 100:");
		guessedNumber = input.nextInt();
		iTries ++;
		if (guessedNumber == secretNumber) {
			System.out.println("Congratulations!");
		}else if (guessedNumber > secretNumber) {
			System.out.println("Too large! Try again.");
		}else {
			System.out.println("To small! Try again.");
		}
		if (iTries == 5) {  // <=== loop will break if this "break" condition is true
			System.out.println("You lost! Secret number was: " + secretNumber);
			break;    // <=== breaks the loop
		}
	} while (secretNumber != guessedNumber);
	 	}
	}


