package array;

import java.util.Arrays;

public class ZerosToFront {
public static void main(String[] args) {
	int[] arr = {1, 0, 1, 0, 1, 1, 0};
	
	int count = 0;
	for (int i = 0; i < arr.length; i++) {
		if (arr[i] == 0) {
			arr[i] = arr[count];
			arr[count] = 0;
			count++;
		}
	}
	System.out.println(Arrays.toString(arr));
}
}