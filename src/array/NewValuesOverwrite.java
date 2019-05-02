package array;

public class NewValuesOverwrite {
	public static void main(String[] args) {
	int [] nums = {1, 2, 3, 4, 5, 6, 7, 8};

	for (int i = 0; i <nums.length; i++) {
		if (i % 2 == 0) {
			nums[i] = 0;
		}else if(i % 2 == 1) {
			nums[i] = 1;
		}
		System.out.print(nums[i]);
	}
	
}
}
