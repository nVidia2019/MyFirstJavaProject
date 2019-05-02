package array;

import java.util.*;

public class SwapTwoValues {
public static void main(String[] args) {
	int [] arr = new int[] {1,2,3,4,5,6};
	System.out.println(Arrays.toString(swapTwoArrayVal(arr)));
}
public static int[] swapTwoArrayVal (int[] arr){
	int temp1 = arr[0];
	int temp2 = arr[arr.length - 1];
	
	for (int i = 0; i < arr.length; i++) {
		if (i == 0) {
			arr[i] = temp2;
		}
		if (i == arr.length - 1) {
			arr[i] = temp1;
		}
	}
	return arr;
}
}
