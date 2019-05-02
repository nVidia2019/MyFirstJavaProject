package array;

import java.util.Arrays;

public class StartEnd {
	public static void main(String[] args) {
		
	int a = 2;
	int b = 16; 
	int l = b-a;
	int[] arr = new int[l];
	String [] arr2 = new String [l];
	for (int i = 0; a < b; i++) {
		arr[i] = a;
		arr2[i] = String.valueOf(arr[i]);
		if (arr[i] % 3 == 0) {
			arr2[i] = "Fizz";
		}
		if (arr[i] % 5 == 0) {
			arr2[i] = "Buzz";
		}
		if (arr[i] % 3 == 0 && arr[i] % 5 == 0) {
			arr2[i] = "FizzBuzz";
		}
		a++;
	}
	System.out.print(Arrays.toString(arr2));
	}	
}

