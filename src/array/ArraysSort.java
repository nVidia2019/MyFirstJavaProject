package array;

import java.util.Arrays;

public class ArraysSort {
public static void main(String[] args) {
	int [] nums = {7, 1, 5, 3, 4, 9, 0, -1};
	
	for(int n: nums) {
		System.out.print(n + " ");
	}
	System.out.println();
	Arrays.sort(nums);
	
	for(int n: nums) {
		System.out.print(n + " ");
	}
	System.out.println();
	char[] charArray = {'c', 'C', 'A', '2'};
			Arrays.sort(charArray);
		for (char ch : charArray) {
			System.out.print(ch + " ");
	}
}
}
