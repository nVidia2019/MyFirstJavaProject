package forLoop;

import java.util.Scanner;

public class Taks7 {
public static void main(String[] args) {
	
	Scanner input = new Scanner(System.in);
	String answer;
	int positive = 0;
	int negative = 0;
	int zeros = 0;
		do {
			System.out.println("Enter a number:");
			int num = input.nextInt();
			 	if (num > 0) {
			 		positive +=1;
			 		}
			 	if (num == 0) {
			 		zeros +=1;
			 	}
			 	if (num < 0)
			 	{
			 		negative +=1;
			 	}
			System.out.println("Do you want to continue?");
			answer = input.next(); 
			if (answer.equals("n")) {
				System.out.println("Positive numbers: " + positive);
				System.out.println("Negative numbers: " + negative);
				System.out.println("Zeros: " + zeros);
				}
			else {
				answer.equals("y");
			}
			}while(answer.equals("y"));
		
}
}
