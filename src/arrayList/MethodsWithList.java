package arrayList;
import java.util.*;

public class MethodsWithList {
public static void main(String[] args) {
	ArrayList <Integer> numsList = new ArrayList<>();
	numsList.add(2);
	numsList.add(3);
	numsList.add(5);
	numsList.add(1);
	numsList.add(4);
	System.out.println(listSum(numsList));
}

public static int listSum (ArrayList<Integer> nums) {
	int sum = 0;
	for (int n : nums) {
		sum += n;  // sum +=nums.get(i) <=== if you want to use for loop
	}
	return sum;
}
}
