package stringManipulationPractice;

import java.util.Scanner;

public class Task2 {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Please enter your greeting message:");
	String str = input.nextLine().toLowerCase().trim();
	int length = str.length();
	boolean str1 = str.startsWith("hi");
	
		if (length < 2) {
			System.out.println("Invalid string");
		}
		else {
				if (str1) {
					str = str.replace("hi", "hello");
					System.out.println(str);
				}
		
		else {
			System.out.println(str);
		}	
		}
}
}
