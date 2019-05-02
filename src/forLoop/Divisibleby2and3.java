package forLoop;

import java.util.Scanner;

public class Divisibleby2and3 {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Enter your final digit: ");
	int end = input.nextInt();
	int numSq;
	for (int num = 1; num <= end; num++) {
		if (num % 2 == 0 && num % 3 == 0) {
			numSq = num * num;
			System.out.print(numSq + " ");
		}
	}
}
}
