package switchStatements;

import java.util.Scanner;

public class AgeValidator {
	public static void main(String[] args) {
		System.out.println("Hello! How old are you?");
		Scanner input = new Scanner(System.in);
		int age = input.nextInt(); 
		
		if (age <= 0 || age > 120) {
			System.out.println("Invalid age");
		}
		else { 
				
			switch(age) {
				case 16:
					System.out.println("almost done with high school");
					break;
				case 24:
					System.out.println("almost done with university");
					break;
				default:
					System.out.println("keep living");
			}
	}
	}
}
