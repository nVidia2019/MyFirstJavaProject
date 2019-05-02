package forLoop;

import java.util.Scanner;

public class PrimeNumber {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	int num;
	
	do {	
	System.out.println("Please enter a number:");
			num = input.nextInt();
			if (num % num == 0)
				System.out.println("Prime number");
			else {
				System.out.println("Not a prime number");
			}
	}while(num != 0);
}
}
