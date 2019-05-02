package stringManipulation;

import java.util.Scanner;

public class CoolName {
public static void main(String[] args) {
	System.out.println("Please enter your name:");
	Scanner input = new Scanner(System.in);
	String name = input.nextLine();
	name = name.toLowerCase().trim();
	boolean empty = name.isEmpty();
	char firstChar = name.charAt(0);
	int l = name.length();
	char lastChar = name.charAt(l - 1);
	
	if (empty) {
		System.out.println("Invalid name");
	}
	else {
		if (firstChar == 'a' && lastChar == 'z') {
			System.out.println("Cool");
	}
			else {
	System.out.println("Not cool");
	}
	}
	
}
}
