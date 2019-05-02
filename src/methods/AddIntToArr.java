package methods;

import java.util.Arrays;

public class AddIntToArr {
public static void main(String[] args) {
	int [] arr = {1, 2, 3};
	int num = 4;
	addToArr(arr, num);
}

public static void addToArr(int[] arr, int num) {
	int[] arr2 = Arrays.copyOf(arr, arr.length + 1);
	//for (int i = 0; i <= arr2.length - 2; i++) {
	//	arr2[i] = arr[i];
		arr2[arr2.length - 1] = num;
	//}
	System.out.println(Arrays.toString(arr2));
}
}
