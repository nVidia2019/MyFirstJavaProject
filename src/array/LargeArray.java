package array;

import java.util.Random;
import java.util.Scanner;

public class LargeArray {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	Random random = new Random();
	
	System.out.println("How many items do you want in the array?");
	int count = input.nextInt(); //Scanner is used to pass number of variables in array
	int[] nums = new int[count]; //declaring array with number of variables we entered
	
	for(int i = 0; i < count; i++) { // in a for loop Random assigned random values to array
		nums[i] = random.nextInt(1000);
	}
	for (int n : nums) {   // for EACH loop prints all variables in the array
		System.out.print(n + ", ");
	}
}
}
