package arrayList;

import java.util.*;

public class RemaindersSum {
public static void main(String[] args) {
	ArrayList<Integer> arrList= new ArrayList<>();
	arrList.add(100);
	arrList.add(200);
	arrList.add(11);
	
	int num = 10;
	System.out.println(remaindersSum(arrList, num));
}
public static int remaindersSum (ArrayList<Integer> arrList, int num) {
	int sum = 0;
	for (int n : arrList) {
		sum += n; 
		}
	if (sum % num == 0) {
		return sum/num;
	}
	else {
		return sum/num+1;
	}
}

}
