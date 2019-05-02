package forLoop;

import java.util.Scanner;

public class Task5 {
public static void main(String[] args) {
	System.out.println("Enter a number:");
	Scanner input = new Scanner(System.in);
	int i = input.nextInt();
	
	for (int times = 1; times <= 10; times++) {
		System.out.println(i + " * " + times + " = " + i * times);
	}
	}
}
