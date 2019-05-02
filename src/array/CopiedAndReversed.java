package array;

import java.util.Arrays;

public class CopiedAndReversed {
public static void main(String[] args) {
	int[] nums = {4, 3, 2, 44, 1, 100, 55, 78};
	// nums = {55, 100, 1, 44, 2, 3, 4};
	
	for (int i = 0; i < nums.length / 2; i++) {
		int temp = nums[i];
		nums[i] = nums[nums.length-(i+1)];
		nums[nums.length-(i+1)] = temp;
	}	
//	for (int num : nums) {
//		System.out.print(num + " ");
	System.out.println(Arrays.toString(nums));
	}
	
}

