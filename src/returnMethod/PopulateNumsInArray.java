package returnMethod;

import java.util.Arrays;

public class PopulateNumsInArray {
public static void main(String[] args) {
	int[] arr = new int[8];
	arr = populateNums(arr);
	System.out.println(Arrays.toString(arr));
}
public static int[] populateNums (int [] arr) {
	for (int i = 0; i < arr.length; i++) {
		arr[i] = i+1;
	}
	return arr;
}
}
