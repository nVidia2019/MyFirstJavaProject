package whileLoop;

import java.util.Scanner;

public class Practice3 {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	int total = 0;
	System.out.println("Enter a negative number:");
	int nextNum = input.nextInt();
	
	while(nextNum > 0) {
		total = total + nextNum;
		nextNum = input.nextInt();
	}
	System.out.println("Sum of all numbers: " + total);
}
}
