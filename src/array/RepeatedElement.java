package array;

public class RepeatedElement {
public static void main(String[] args) {
	int[] nums = {1, 1, 2, 2, 3, 4, 3, 5};
	
	for (int outer = 0; outer < nums.length; outer++) {
		boolean duplicate = false;
		int currNum = nums[outer];
		
	for (int inner = 0; inner < nums.length; inner++) {
		if (currNum == nums[inner] && outer != inner) {
			duplicate = true;
			break;
		}
		}
	if (duplicate == false) {
		System.out.println(currNum);
	}
	}
	}
}
