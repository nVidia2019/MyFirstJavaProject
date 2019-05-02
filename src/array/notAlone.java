package array;

import java.util.Arrays;

public class notAlone {
public static void main(String[] args) {
	int [] arr = {1, 2, 3, 4, 5};
	int bigger = arr[0];
	
	for (int i = 1; i < arr.length - 1; i++) {
		if (arr[i+1] > arr[i-1]) {
			bigger = arr[i+1];
			arr[i] = bigger;
		}
		if (arr[i-1] > arr[i+1]) {
			bigger = arr[i-1];
			arr[i] = bigger;
		}
	}
System.out.println(Arrays.toString(arr));
}
}
