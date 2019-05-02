package practiceIfElseSwitch;

import java.util.Scanner;

public class Task1 {
	public static void main(String[] args) {
		System.out.println("Please enter 3 different integers:");
		Scanner input = new Scanner(System.in);
		int int1 = input.nextInt();
		int int2 = input.nextInt();
		int int3 = input.nextInt();
		
		if (int1 > int2 && int1 > int3) {
			System.out.println("Maximum value of " + int1 + ", " + int2 + " and " + int3 + " is: " + int1);
		}
		if (int2 > int1 && int2 > int3) {
			System.out.println("Maximum value of " + int1 + ", " + int2 + " and " + int3 + " is: " + int2);
		}
		else {
			System.out.println("Maximum value of " + int1 + ", " + int2 + " and " + int3 + " is: " + int3);
		}
	}
}
