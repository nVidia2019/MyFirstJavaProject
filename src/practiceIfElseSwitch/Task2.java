package practiceIfElseSwitch;

import java.util.Scanner;

public class Task2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double double1, double2, result;
		result = 0;
		String operator;
		boolean invalidOperator = false;
		System.out.println("Enter two double values:");
		double1 = input.nextDouble();
		double2 = input.nextDouble();
		
		System.out.println("Choose operator from below options:\n+, -, *, /");
		operator = input.next();
				
		
		switch (operator) {
		case "+":
			result = double1 + double2;
			break;
		case "-":
			result = double1 - double2;
			break;
		case "*":
			result = double1 * double2;
			break;
		case "/":
			result = double1 / double2;
			break;
		default: 
			System.out.println("Please enter a valid operator. Try again!");
			invalidOperator = true;
		}
		if (!invalidOperator) {
			System.out.println("Result of " + double1 + " " + operator + " " + double2 + "is " + result);
		}
		
					
			//!false = true, !true = false
		}
		
	}

