package array;

public class CountEvenNumbersinArray {
public static void main(String[] args) {
	// count even numbers in array
	int[] nums = {2, 4, 6, 8, 1};
	
	int count = 0;
	for(int n : nums) {
		if(n % 2 == 0) {
			count++;
		}
	}
	System.out.println("Even numbers: " + count);
}
}
