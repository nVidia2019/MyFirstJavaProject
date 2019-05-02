package forLoop;

import java.util.Scanner;

public class Task4NeighbouringChar { // incorrect code, return to it later
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Please enter a word with some same neighbouring letters:");
	String word = input.nextLine();
		
	for (int index = 0; index < word.length() - 1; index ++) {
			if (word.charAt(index) == word.charAt(index + 1));{
				System.out.println("Beep! - " + word.charAt(index));
			    }
		}
}
}
