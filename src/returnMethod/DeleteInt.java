package returnMethod;

import java.util.Arrays;

public class DeleteInt {
public static void main(String[] args) {
	int [] arr = {1,2,3,4,8,9};
	int num = 4;
	int [] newArr = deleteInt(arr, num);
	System.out.println(Arrays.toString (newArr));
}
	public static int [] deleteInt (int[] arr, int num) {
		int [] newArr = new int [arr.length - 1];
		for (int i = 0; i < newArr.length; i++) {
			if (arr[i] == num) {
				for (int j = i+1; j < arr.length; j++)
					arr[j-1] = arr [j];
			}
			newArr[i] = arr [i];
		}
		return newArr;
	 }
}
