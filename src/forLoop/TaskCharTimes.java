package forLoop;

import java.util.Scanner;

public class TaskCharTimes {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Please enter a word");
	String word = input.nextLine();
	System.out.println("Please enter a character");
	String char1 = input.nextLine();
	int l = word.length();
	int times = 0;
	
	for (int ind = 0; ind < l; ind++) {
		if (word.substring(ind, ind + 1).equals(char1))
			times++;
	}
	System.out.println("Your character was " + times + " times in your word");
	}
}
