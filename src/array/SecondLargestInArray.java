 package array;

public class SecondLargestInArray {
public static void main(String[] args) {
	int [] nums = {-500, 9, -500, -100, -101};
	int biggest = nums[0];
	int secondBig = nums[0]; 
	
	for(int i = 0; i <= nums.length - 1; i++) {
		if (biggest < nums[i]) {
			secondBig = biggest;
			biggest = nums[i]; 
		  }
		
		if(nums[i] > secondBig && biggest != nums[i]){
			secondBig = nums[i];
		}
		}
	System.out.println("Your array biggest value is: " + biggest);
	System.out.println("Your array second biggest value is: " + secondBig);
}
}
