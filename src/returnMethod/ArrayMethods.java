package returnMethod;

import java.util.*;

public class ArrayMethods {
public static void main(String[] args) {
	int [] arr = buildArray();
	System.out.println(Arrays.toString(arr));
	
} public static int[] buildArray() {  // <=== you can create a custom method with no parameters (arguments), random class can assign them.
		Random random = new Random();
		int[] arr = new int[5];
		for(int i = 0; i < arr.length; i++) { 
			arr[i] = random.nextInt(101); // <=== random will generate numbers from 0 to 100.
			}
		return arr;
}
}