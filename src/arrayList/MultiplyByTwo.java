package arrayList;

import java.util.*;

public class MultiplyByTwo {
public static void main(String[] args) {
	ArrayList<Integer> arrList = new ArrayList<>();
	arrList.add(3);
	arrList.add(30);
	
	System.out.println(multiplyByTwo(arrList));
}
public static ArrayList<Integer> multiplyByTwo (ArrayList<Integer> nums){
	for (int i = 0; i < nums.size(); i++) {
		nums.set(i, nums.get(i)*2);
	}
	return nums;
}
}
