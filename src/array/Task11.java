package array;

public class Task11 {
public static void main(String[] args) {
	int[] arr = {9, 6, 8, 6, 4, 2, 3};
	
	for (int n: arr) {
		if (n == 4) {
			break;
		}
		System.out.print(n + " ");
	}
}
}
