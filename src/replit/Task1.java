package replit;

import java.util.Scanner;

public class Task1 {
	public static void main(String[] args) {
		
	
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a number:");
		int num = input.nextInt();
		String str = " " + num;
		str = str.trim();
		int length = str.length();
		char lastChar = str.charAt(length - 1);
				
		if (lastChar == '3') {
			System.out.println("Cool");
		}
		else {
			System.out.println("Not cool");
		}
	}
}
