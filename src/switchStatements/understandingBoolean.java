package switchStatements;

import java.util.Scanner;

public class understandingBoolean {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String name;
		boolean currentStudent;
		String answer;
		System.out.println("Please enter your name:");
		name = input.nextLine();
		System.out.println("Are you a student currently?\nyes/no");
		answer = input.nextLine();
		
		if (answer.equals("yes")) {
			currentStudent = true;
		}
		else  {
			currentStudent = false;
		}
		System.out.println("Name: " + name);
		System.out.println("Current student: " + currentStudent);
		
		if (currentStudent) {
			System.out.println(name + " you rock");
		}
	}
	
}
 