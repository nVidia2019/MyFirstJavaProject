 package arrayList;

import java.util.*;

public class ArrayListUpdate {
public static void main(String[] args) {
	List<Integer> nums = new ArrayList<>();
	nums.add(100);
	nums.add(200);
	nums.add(300);
	nums.add(400);
	nums.add(500);
	System.out.println(nums);
	
	nums.set(0, 1000);
	System.out.println(nums);
	nums.set(1, nums.get(1) * 2); // <=== multiply value under index 1
	System.out.println(nums);
	System.out.println(nums.indexOf(300));
	int position = nums.indexOf(300);
	nums.set(position, 3);
	System.out.println(nums);
	nums.set(nums.indexOf(500), 65); // <===set "65" for the index of "500"
	System.out.println(nums);
}
}
