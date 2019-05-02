package methods;

public class CountPositiveNegativeZero {
public static void main(String[] args) {
	int[] nums = {2, 0, -6, 1, 0, 6};
	countPNZ(nums);
}

public static void countPNZ (int[] nums) {
	int countP = 0;
	int countN = 0;
	int countZ = 0;
	for (int num : nums) {
		if (num > 0) {
			countP +=1;
		}else if (num < 0) {
			countN +=1;
		}
		if (num == 0) {
			countZ +=1;
		}
	}
	System.out.println("Number of positive: " + countP);
	System.out.println("Number of negative: " + countN);
	System.out.println("Number of zeros: " + countZ);
}
}
