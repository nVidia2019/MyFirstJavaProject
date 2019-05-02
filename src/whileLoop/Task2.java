package whileLoop;

import java.util.Scanner;

public class Task2 {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	int num1, num2;
	System.out.println("Please enter 2 numbers:");
	num1 = input.nextInt();
	num2 = input.nextInt();
	
	while (num1 < num2 && num1 != num2); {
		System.out.println("Step " + num2);
		num2--;
	}
	 
	while (num1 > num2 && num1 != num2); {		
		System.out.println("Step " + num1);
		num1--;	
	}
}
}
