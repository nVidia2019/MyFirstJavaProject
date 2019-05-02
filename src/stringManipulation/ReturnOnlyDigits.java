package stringManipulation;

import java.util.Scanner;

public class ReturnOnlyDigits {
public static void main(String[] args) {
	System.out.println("Enter your text with letters, characters and digits:");
	Scanner input = new Scanner(System.in);
	String str = input.nextLine();
	String str2 = "";
	for (int i = 0; i < str.length(); i++) {
		if (str.charAt(i) >= 48 && str.charAt(i) <=57) {
			str2 += str.substring(i, i+1);
		}
		}
	System.out.println(str2);
}
}
