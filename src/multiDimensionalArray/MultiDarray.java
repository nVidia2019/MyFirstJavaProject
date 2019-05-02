package multiDimensionalArray;

public class MultiDarray {
public static void main(String[] args) {
	int[][] nums = new int[2][3]; // <=== 2 arrays with 3 variables in each of them
	nums[0][0] = 10; // <===the 1st variable of the 1st array has value 10
	nums[0][1] = 20;
	nums[0][2] = 30; //<===if you declare less variables then 3, array will still have length 3 and not declared variable will have default value (in the case 0)
	
	nums[1][0] = 40;
	nums[1][1] = 50;
	nums[1][2] = 60;
	
	int[][] nums2 = {{10, 20, 30} , {40, 50, 60}}; // this array is exactly the same as nums array above.
	
	System.out.println(nums[0][0]);
	System.out.println(nums[0][2]);
	System.out.println("Number of arrays: " + nums.length);
	System.out.println("Number of values in 1st array (with index 0): " + nums[0].length );
	
}
}
