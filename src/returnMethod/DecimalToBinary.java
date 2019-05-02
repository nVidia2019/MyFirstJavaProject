package returnMethod;

import java.util.Arrays;

public class DecimalToBinary {
public static void main(String[] args) {
	int num = 255;
	int[]arr = decimalToBinary(num);
	System.out.println(Arrays.toString(arr));
}
public static int[] decimalToBinary (int num) {
		int [] arr = new int[8];
		int[] binary = {128, 64, 32, 16, 8, 4, 2, 1};
		for (int i = 0; i < arr.length; i++) {
			if (num >= binary[i]) {
				arr[i] = 1;
				num -= binary[i];
			}
		}
		return arr;
}
}