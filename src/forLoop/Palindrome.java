package forLoop;

import java.util.Scanner;

public class Palindrome { // task to find out if a word is palindrome 
public static void main(String[] args) {
		System.out.println("Please enter a word:");
		Scanner input = new Scanner (System.in);
		String word = input.nextLine();    //String reversed
		String reversed = "";
		for (int ind = word.length()-1; ind >= 0; ind --) {
			reversed = reversed + word.charAt(ind);}
		if (reversed.equals(word)){
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not palindrome");
		}
}
}

