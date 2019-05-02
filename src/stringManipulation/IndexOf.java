package stringManipulation;

import java.util.Scanner;

public class IndexOf {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Please enter your message:");
	String message = input.nextLine().toLowerCase(). trim();
	
	int badWord1 = message.indexOf("silly");
	int badWord2 = message.indexOf("heck");
	int badWord3 = message.indexOf("idiot");
	boolean check = ((badWord1 >= 0) || (badWord2 >= 0) || (badWord3 >= 0));
	
	if (check) {
		System.out.println("Message failed");
	}
	else {
		System.out.println("Message sent");
	}
}
}
