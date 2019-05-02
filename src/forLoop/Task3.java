package forLoop;

import java.util.Scanner;

public class Task3 {
public static void main(String[] args) {
	
	Scanner input = new Scanner(System.in);
	System.out.println("Please enter a word with at least 1 character used miltiple times:");
	String word = input.nextLine().toLowerCase();
	String unique = "";
	
	for (int ind = 0; ind < word.length(); ind++) {
		if (!unique.contains(word.substring(ind, ind + 1))) {
			unique += word.substring(ind, ind + 1);
		}
			}
System.out.println("Your word with only unique characters is: " + unique);
}
}
