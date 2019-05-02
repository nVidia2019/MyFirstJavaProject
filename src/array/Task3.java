package array;

public class Task3 {
public static void main(String[] args) {
	int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9};
			// even - double it and assign back, odd - triple and assign back
	for(int n : nums) {
		System.out.print(n + " ");
	}
		System.out.println();
	for(int n : nums) {
			if (n % 2 == 0) {
			n = n*2;
			System.out.print(n + " ");
		} else {
			n = n*3;
			System.out.print(n + " ");
		}

	}
		}
}
