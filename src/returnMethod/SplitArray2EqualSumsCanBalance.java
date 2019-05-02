package returnMethod;

public class SplitArray2EqualSumsCanBalance {
public static void main(String[] args) {
	int[] arr = {1, 90, 9, 70, 20, 10};
	System.out.println(canBalance(arr));
}
public static boolean canBalance (int[] arr) {
	int lSum = 0;
		  for (int i = 0; i < arr.length; i++) {
		    lSum += arr[i];
		    int rSum = 0;
		    	for (int j = arr.length-1; j > i; j--) {
		    		rSum += arr[j];
		    	}
		    if (rSum == lSum)
		      return true;
		  }
		  return false;
		}
}
