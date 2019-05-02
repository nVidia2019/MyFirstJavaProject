package methods;

import java.util.*;  //.* <===imports all classes from java.util package

public class Calculator {
public static void main(String[] args) {
	double n1 = 10;
	double n2 = 5;
	add (n1, n2);
	subtract(n2,  n1);
	multiply(n1, n2);
	divide(n1, n2);
	
	add(8, 1);
	double d1 = 100;
	double d2 = 5;
	subtract(d1, d2);
	Scanner input = new Scanner(System.in);
	System.out.println("Enter two numbers: ");
	d1 = input.nextDouble();
	d2 = input.nextDouble();
	System.out.println("Choose operation: \n" + 
		"1 - add \n" +
		"2 - subtract \n" +
		"3 - multiply \n" +
		"4 - divide");
	int operation = input.nextInt();
	switch (operation) {
		case 1:
			add(d1, d2);
			break;
		case 2:
			subtract(d1, d2);
			break;
		case 3:
			multiply(d1, d2);
			break;
		case 4:
			divide(d1, d2);
			break;
		default:
			System.out.println("Error! Invalid operation");
			break; 
	}
	
}


public static void add(double double1, double double2) {
	System.out.println(double1 + double2);
}
public static void subtract(double double1, double double2) {
	System.out.println(double1 - double2);
}
public static void multiply(double double1, double double2) {
	System.out.println(double1 * double2);
}
public static void divide(double double1, double double2) {
	if (double2 == 0) {
		System.out.println("Error! Cannot divide by 0");
	}
	System.out.println(double1 / double2);
}
}
