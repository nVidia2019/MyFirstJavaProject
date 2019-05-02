package array;

import java.util.Scanner;

public class SumofArrayValues {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("How many numbers do you want to enter in the array?");
	int count = input.nextInt();
	int[] numbers = new int [count];
	
	for (int i = 0; i < count; i++) {
		System.out.println("Enter your number:");
		numbers[i] = input.nextInt();
	 }
	int sum = 0;
	int sumOfEvens = 0;
	int sumofOdds = 0; 
	for (int n : numbers) {
		sum += n;
		if (n % 2 == 0) {
			sumOfEvens +=n;
		}else {
			sumofOdds +=n;
		}
	}
	System.out.println("The sum of your numbers is: " + sum);
	System.out.println("The sum of even numbers is: " + sumOfEvens);
	System.out.println("The sums of odd numbers is: " + sumofOdds);
}
}
