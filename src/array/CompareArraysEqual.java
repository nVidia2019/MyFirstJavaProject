package array;

import java.util.Arrays;

public class CompareArraysEqual {
public static void main(String[] args) {
	
	int[] arr1 = {45, 32, 54};
	int[] arr2 = arr1;
	System.out.println(arr1 == arr2); // <=== it's true, as these two arrays are the same object in the same memory
	
	int[] arr3 = {45, 32, 54};
	System.out.println(arr1 == arr3); // <=== false, as these are two different objects in memory
	System.out.println(Arrays.equals(arr1, arr3)); // true as this class compares values inside these 2 arrays
}

}
