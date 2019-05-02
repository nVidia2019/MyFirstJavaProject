package returnMethod;

public class binaryToDecimal {
public static void main(String[] args) {
	int [] arr = {0, 1, 0, 0, 0, 0, 1, 1};
	System.out.println(binaryToDecimal(arr));
}
public static int binaryToDecimal (int [] arr) {
	int num = 0;
	int[] binary = {128, 64, 32, 16, 8, 4, 2, 1};
	for (int i = 0; i < arr.length; i++) {
		if (arr[i] == 1) {
			arr[i] = binary [i];
		} 
	num += arr[i];
	}
	return num;
}
}
