package returnMethod;

public class isEven {
public static void main(String[] args) {
	int [] arr = {1, 1, 2, 5, 4};
	oddOrEven(arr);
}
public static void oddOrEven(int []arr) {
	for (int num : arr) {
		boolean Even = false;
		if (num % 2 == 0) {
			Even = true;
		}else {
			Even = false;
		}
		System.out.print(Even + " ");
	}
}
}
