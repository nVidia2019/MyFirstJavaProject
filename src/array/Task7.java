package array;

public class Task7 {
public static void main(String[] args) {
	int[] arr = {1, 7, 9, 5};
	int [] arr2 = {arr[0], arr[arr.length-1]};
	
	for (int a: arr2) {
		System.out.print(a + ", ");
	}
	System.out.println();
	int[] array1 = {1, 3, 5}; // <=== Task2
	int[] array2 = {7, 9, 11};
	
	int[] array3 = {array1[1], array2[1]};
	
	for (int arr1: array3) {
	System.out.print(arr1 + ", ");
	}
	System.out.println();
	System.out.print(array3[0] + ", " + array3[1]);
}
}
