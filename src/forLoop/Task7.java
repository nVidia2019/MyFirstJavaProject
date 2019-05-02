package forLoop;

import java.util.Scanner;

public class Task7 {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

	String answer = "y";
	System.out.println("Enter a number:");
	int num = input.nextInt();
	int biggest = num;
	int smallest = num;
	System.out.println("Do you want to continue: y/n?");
	answer = input.next();
	
	while (answer.equals("y")) {
		System.out.println("Enter a number:");
		num = input.nextInt();
		System.out.println("Do you want to continue: y/n?");
		answer = input.next();
		
		if (num >= biggest) {
			biggest = num;
		}
		if (num <= smallest) {
			smallest = num;
		}
			}
	System.out.println("The biggest number you entered is: " + biggest);
	System.out.println("The smallest number you entered is: " + smallest);
}
}
