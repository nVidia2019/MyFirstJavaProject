package returnMethod;

import java.util.Scanner;

public class Calculator2 {
	public static void main(String[] args) {
		double n1 = 10;
		double n2 = 5;
		System.out.println(add (n1, n2));
		System.out.println(subtract(n2, n1));
		System.out.println(multiply(n1, n2));
		System.out.println(divide(n1, n2));
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter two numbers: ");
		double d1 = input.nextDouble();
		double d2 = input.nextDouble();
		System.out.println("Choose operation: \n" + 
			"1 - add \n" +
			"2 - subtract \n" +
			"3 - multiply \n" +
			"4 - divide");
		int operation = input.nextInt();
		switch (operation) {
			case 1:
				System.out.println(add(d1, d2));
				break;
			case 2:
				System.out.println(subtract(d1, d2));
				break;
			case 3:
				System.out.println(multiply(d1, d2));
				break;
			case 4:
				System.out.println(divide(d1, d2));
				break;
			default:
				System.out.println("Error! Invalid operation");
				break; 
		}
		
	}


	public static double add (double double1, double double2) {
		double sum = double1 + double2;
		return sum;		
	}
	public static double subtract(double double1, double double2) {
		double subtraction = double1 - double2;
		return subtraction;
	}
	public static double multiply(double double1, double double2) {
		double multiplication = double1 * double2;
		return multiplication;
	}
	public static double divide(double double1, double double2) {
		if (double2 == 0) {
			System.out.println("Error! Cannot divide by 0");
		}
		double division = double1 / double2;
		return division;
	}
	}

