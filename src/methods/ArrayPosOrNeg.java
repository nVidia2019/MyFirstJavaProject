package methods;

public class ArrayPosOrNeg {
public static void main(String[] args) {
	int[] arr = {5, -9, 7, 0, 1, 2, 3, -7};
	posOrNeg(arr);
}
public static void posOrNeg(int [] arr) {
	for (int num: arr) {
		if (num > 0) {
			System.out.println(num + " is positive;");
		}else if (num < 0) {
			System.out.println(num + " is negative;");
		}else if (num == 0) {
			System.out.println(num + " is zero;");
		}
	}
}
}
