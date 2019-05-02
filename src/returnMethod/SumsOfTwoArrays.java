package returnMethod;

import java.util.Arrays;
import java.util.Random;

public class SumsOfTwoArrays { 

	public static void main(String[] args) {
		int [] arr1 = {1};
		int [] arr2 = {5, 6};
		int [] arrSum = twoArraysSum(arr1, arr2);
		System.out.println(Arrays.toString(arrSum));
	}
//	  public static int[] twoArraysSum (int[] arr1, int[] arr2) { //<=== this code is only for the case when arr1.length = arr2.length
//		 int [] arrSum = new int [arr1.length];
//			    for (int i = 0; i < arr1.length; i++) {
//			    	arrSum[i] = arr1[i] + arr2[i];
//			    }
//		return arrSum;
//	 }
	public static int[] twoArraysSum (int[] arr1, int[] arr2) { //<=== this code is for the case when we don't know if arrays have equal length
	 int[] newArr;
		if (arr1.length >= arr2.length) {
			newArr = arr1;
			for (int i = 0; i < arr2.length; i++){
				newArr[i] = arr2[i];
			}
		}else {
			newArr = arr2;
			 for (int i = 0; i < arr1.length; i++) {
			    	newArr[i] = arr1[i];
			    }
		}
		 return newArr;
   }
}

