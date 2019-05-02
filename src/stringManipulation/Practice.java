package stringManipulation;

import java.util.Scanner;

public class Practice {
public static void main(String[] args) {
	System.out.println("Please enter a word:");
	Scanner input = new Scanner(System.in);
	String word = input.nextLine();
	int l = word.length();
		
	if (l >= 2) {
		System.out.println(word.substring(1, l - 1));
		}
	else {
		System.out.println("Your word is too short.");
	}
}
}
