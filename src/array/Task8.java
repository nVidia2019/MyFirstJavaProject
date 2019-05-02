package array;

import java.util.Arrays;

public class Task8 {
public static void main(String[] args) {
	int[] arr = {1, 10, 10, 5};
	int[] arr2 = new int [arr.length];
	int num = 0;
	
 	for (int i = 0; i < arr.length; i++) {
		
			if (arr[i] != 10) {
				arr2[num] = arr[i];
				num++;
			}
			}
	System.out.print(Arrays.toString(arr2));
}
}
