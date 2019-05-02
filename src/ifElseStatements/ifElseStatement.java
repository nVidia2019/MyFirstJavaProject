package ifElseStatements;
import java.util.Scanner;

public class ifElseStatement {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome! Please enter your name:");
		int age = input.nextInt();
		
		if ((age <= 0) || (age > 120)) {
		 System.out.println("Invalid age");
		}
		else {
			int x = 21-age;
			
			if(age >=21) {
				System.out.println("Welcome to the Club!");
			}
			else if(age==20) {
			System.out.println("\nNot enough age!");
			System.out.println("Please come back in 1 year."); 
			}
					
			else {
				System.out.println("\nNot enough age!");
				System.out.println("Please come back in " + x + " years.");
			}
			}
				
		}
}
