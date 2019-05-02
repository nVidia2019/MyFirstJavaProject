package stringManipulation;

import java.util.Scanner;

public class Task7 {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Please enter some text:");
	String text = input.nextLine();
	text = text.trim();
	boolean hasMultipleWords;
	boolean check = text.contains(" ");
	boolean check2 = text.isEmpty();
	
	if (!check2) {
		if (check) {
		hasMultipleWords = true;
		System.out.println("Your text has multiple words: " + hasMultipleWords);
			}
		else {
		hasMultipleWords = false;
		System.out.println("You text is a single word.");
			}
				}
	else {
		System.out.println("Please enter at least one character:");
	}
	}
}
