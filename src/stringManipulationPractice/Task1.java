package stringManipulationPractice;

import java.util.Random;
import java.util.Scanner;

public class Task1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a string over 10 char:");
		String str = input.nextLine();
		Random random  = new Random();
		int length = str.length();
		int ran = random.nextInt(10); // our random number will be from 0 to 9
		String str1 = str.substring(0,ran);
		String str2 = str.substring(ran+1);
		String str3 = str.substring(ran,ran+1);
		
		if (length > 0 && length < 10) {
			System.out.println("Invalid String");
		}
		else {
			System.out.println("String was cut from " + ran + " index and now it is: " + str1 + str2);
			System.out.println("Your substring that has been cut out is " + str3);
		}
	}

}
