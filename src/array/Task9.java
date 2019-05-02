package array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Task9 {
public static void main(String[] args) {
	int[] arr = {0, 5, 0, 3};
	int max;
	
	for (int i = 0; i < arr.length - 1; i++) {
		if (arr[i] == 0) {
			max = 0; 
			for (int k = i + 1; k < arr.length; k++) {
				if (arr[k] > max && arr[k] % 2 == 1)
					max = arr[k];
				}
			if (max != 0)
				arr[i] = max;
		}
		}
	System.out.print(Arrays.toString(arr));
}
}
