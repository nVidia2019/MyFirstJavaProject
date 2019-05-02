package switchStatements;

import java.util.Scanner;

public class KnowledgeValidator {
	public static void main(String[] args) {
		
		System.out.println("What your grade?");
		Scanner input = new Scanner(System.in);
		String grade = input.nextLine();
		int gradeLength = grade.length();
		grade = grade.toUpperCase();
		
		if (gradeLength > 1) {
			System.out.println("Please enter only one character:");
		}
		else {
		
		switch (grade) {
	case "A":
		System.out.println("Your grade is A");
		break;
	case "B":
		System.out.println("Your grade is B");
		break;
	case "C":
		System.out.println("Your grade is C");
		break;
	case "D":
		System.out.println("Your grade is D");
		break;
	case "E":
		System.out.println("Your grade is E");
		break;
	case "F":
		System.out.println("Your grade is F");
		break;
	default:
		System.out.println("Invalid grade.");
	}
		}
	}
}