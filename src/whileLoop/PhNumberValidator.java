package whileLoop;

import java.util.Scanner;

public class PhNumberValidator {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Enter a phone number:");
	String phnum = input.nextLine();
		
	if (phnum.startsWith("(")) {
		if(phnum.length() != 12) {
		System.out.println("Invalid length, must be either 12 or 10 char.");
		return;
		}
		}else {
			if(phnum.length() != 10) {
			System.out.println("Invalid length, must be either 12 or 10 char.");
			return;
		}
		}	
	if(phnum.charAt(0) == '(') {
		if (phnum.charAt(4) != ')') {
			System.out.println("Invalid format: no closing parenthesis.");
			return;
		}
	}
	phnum = phnum.replace("(", "");
	phnum = phnum.replace(")", "");
	for (int ind = 0; ind < phnum.length(); ind ++) {
		if (!(phnum.charAt(ind) >= '0' && phnum.charAt(ind) <= '9')) {
			System.out.println("Invalid character: " + phnum.charAt(ind));
			return;
		}
	}
	}
}
