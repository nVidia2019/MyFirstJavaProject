package methods;

public class MethodsWithConditions {
public static void main(String[] args) {
	int i1 = 2;
	int i2 = 2;
	getLarger(i1, i2);
	getMax(new int[] {0, 3, 6, 9});
	}


public static void getLarger(int int1, int int2) {
	int largest = 0;
	if (int1 > int2) {
		largest = int1;
		System.out.println(largest);
	}else if (int2 > int1) {
		largest = int2;
		System.out.println(largest);
	}else {
		System.out.println("Numbers are equal.");
	}
	}


public static void getMax(int [] nums) {
	int max = nums[0];
	if (nums.length == 0) {
		System.out.println("Error! Array is empty.");
		return;
	}
	for (int i = 0; i < nums.length; i++) {
		if (nums[i] >= max);{
			max = nums[i];
		}
	}
	System.out.println(max);
}
}


