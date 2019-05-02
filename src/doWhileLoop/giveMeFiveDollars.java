package doWhileLoop;

import java.util.Scanner;

public class giveMeFiveDollars {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	int amount =1;
	int tries = 1;
	
	do {
		System.out.println("Please enter at least 5 dollars:");
		amount = input.nextInt();
		tries++;
	}while(amount < 5 && tries < 4); // <=== loop will run while this condition is true
	
	if (amount >= 5) {
	System.out.println("Thank you!");
	}
	else {
		System.out.println("You've failed!");
	}
}
}
