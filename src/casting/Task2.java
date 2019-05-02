package casting;

import java.util.Scanner;

public class Task2 {
	public static void main(String[] args) {
		System.out.println("Please enter your message:");
		Scanner input = new Scanner(System.in);
		String message = input.nextLine().trim();
		char firstChar = message.charAt(0);
		int decimalValue = firstChar;
		boolean capital = (decimalValue >=65 && decimalValue <= 90);
		boolean punctuation = (message.endsWith (".") || message.endsWith ("!"));
		
		if (capital && punctuation) {
			System.out.println("Message is valid");
		}
		else {
			System.out.println("Invalid massage");
		}
	}
}
