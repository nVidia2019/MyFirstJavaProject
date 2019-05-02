package arrayList;

import java.util.ArrayList;

public class WrapperClassesIntro {
public static void main(String[] args) {
	Integer n = 100;
	ArrayList<Integer> nums = new ArrayList<>();
	nums.add(300);
	nums.add(500);
	nums.add(1234);
	
	for (Integer num : nums) {
		System.out.println(num);
	}
	
	for (int num : nums) {   // <=== Java turns Integer (Object) into an int (primitive)
		System.out.println(num);
	}
	
	for (int i = 0; i < nums.size(); i++) {
		System.out.print(nums.get(i) + " ");
	}
}

}
