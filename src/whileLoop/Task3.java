package whileLoop;

import java.util.Scanner;

public class Task3 {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Enter a word:");
	String word = input.nextLine();
	int l = word.length();
	int charN = 0;
	
	while (charN < l) {
		
		System.out.println(word.charAt(charN));
		charN++;
	}
	
}
}
