package returnMethod;

import java.util.ArrayList;

public class maxMirror {
public static void main(String[] args) {
	int[] arr = {1, 4, 3, 5, 6, 3, 4, 1}; 
	System.out.println(maxMirror(arr));
}
public static int maxMirror(int[] nums) {
    int max = 0;
    for(int i = 0; i < nums.length; i++) {
        int count = 0;
        for(int j = nums.length - 1; j >= 0 && i + count < nums.length; j--) {
            if(nums[i + count] == nums[j]) {
                count++;
            } else {
                max = Math.max(max, count);
                count = 0;
            }
        }
        max = Math.max(max, count);
    }
    return max;
}
}
