package stringManipulation;

import java.util.Scanner;

public class Practice2 {
	public static void main(String[] args) {
		System.out.println("Please enter a word:");
		Scanner input = new Scanner(System.in);
		String word = input.nextLine();
		int l = word.length();
		
		if (l >=4 && l % 2 == 0)
		{
			System.out.println(word.substring(l/2 - 1, l/2 + 1));
		}
		else if (l >= 5 && l % 2 ==1) {
			System.out.println(word.substring(l/2 -1 , l/2 + 2));
		}
		}
}
