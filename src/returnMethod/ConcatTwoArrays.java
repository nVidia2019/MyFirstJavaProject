package returnMethod;

import java.util.Arrays;

public class ConcatTwoArrays {
public static void main(String[] args) {
	int []arr1 = {7, 5, 9, 3,};
	int []arr2 = {9};
	int [] newArr = concatTwoArrays(arr1, arr2);
	System.out.println(Arrays.toString(newArr));
}
public static int [] concatTwoArrays(int[] arr1, int[] arr2) {
	int l = arr1.length + arr2.length;
	int[] newArr = new int[l];
	for (int i = 0; i < arr1.length; i++) {
		newArr[i] = arr1[i];
		}
	int z = 0;
	for (int j = arr1.length; j < arr1.length + arr2.length; j++) {
		newArr[j] = arr2[z];
		z++;
	}
	return newArr;
}

}      
