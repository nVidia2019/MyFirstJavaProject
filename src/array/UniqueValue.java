package array;

public class UniqueValue {
public static void main(String[] args) {
	int[] nums = {1, 2, 2, 3, 4, 5, 6, 6, 6, 7};
	
	for(int outer = 0; outer < nums.length;  outer++) {
		int currentNum = nums[outer];
		boolean duplicate = false; 
		
		for (int inner = 0; inner < nums.length; inner++)  {
			
			if (nums[inner] == currentNum && inner != outer) {
				duplicate = true; // number is not unique, exit from inner loop 
				break;
			}
		}
		if (duplicate == false) {
			System.out.print(currentNum);
	}
}
}
}

