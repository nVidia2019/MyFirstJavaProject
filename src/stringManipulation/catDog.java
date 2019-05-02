package stringManipulation;

import java.util.Scanner;

public class catDog {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your word: ");
		String str = input.nextLine();
		str = str.toLowerCase();
		boolean equalCatsDogs = false;
		int countCat = 0;
		int countDog = 0;
		
		for (int i = 0; i<str.length()-2; i++) {
			if (str.charAt(i) == 'c' && str.charAt(i + 1) == 'a' && str.charAt(i + 2) == 't') {
				countCat +=1;
			}
			if (str.charAt(i) == 'd' && str.charAt(i + 1) == 'o' && str.charAt(i + 2) == 'g') {
				countDog +=1;
			}
		}
		if (countCat == countDog) {
			equalCatsDogs = true;
		}
		System.out.println(equalCatsDogs);
	}
}
