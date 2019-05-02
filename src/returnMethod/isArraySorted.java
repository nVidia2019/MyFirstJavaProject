package returnMethod;

public class isArraySorted {
public static void main(String[] args) {
	int[] arr = {0, 0, 3};
	System.out.println(isArraySorted(arr));
}
public static boolean isArraySorted (int[] arr) {
	boolean isSorted = false;
	for (int i = 0; i < arr.length - 1; i++) {
		if (arr [i] > arr [i+1]) {
			isSorted = false;
			break;
		}else {
			isSorted = true;
		}
	}
	return isSorted;
}
}
