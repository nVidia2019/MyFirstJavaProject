package array;

import java.util.Scanner;

public class FindTheBiggestWithScanner {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("How many prices do you want to enter in the array?");
	int count = input.nextInt();
	double[] prices = new double [count];
	int i = 0;
	while (i < count) {
		System.out.println("Enter your price:");
		prices[i] = input.nextDouble();
		i++;
	 }
	double highest = prices[0];
	double lowest = prices[0];
	
	for (int ind = 0; ind < prices.length; ind++) {
		if (prices[ind] >= highest) {
			highest = prices[ind];
			}

		if (prices[ind] <= lowest) {
			lowest = prices[ind];
			}
	}
	System.out.println("The highest price is " + "$" + highest);
	System.out.println("The lowest price is " + "$" + lowest);
}
}
