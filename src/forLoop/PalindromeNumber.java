package forLoop;

import java.util.Scanner;

public class PalindromeNumber {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Enter a number:");
	String num = input.next();
	String palindrome = "";
	int index;
	
	for (index = num.length()-1; index >= 0; index --) {
		palindrome = palindrome + num.charAt(index);
	}
	if (num.contentEquals(palindrome)){
		System.out.println("Palindrome number");
		}
	else {
		System.out.println("Not a palindrome number");
	}
}
}
