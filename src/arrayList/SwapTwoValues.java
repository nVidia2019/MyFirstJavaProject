package arrayList;

import java.util.*;

public class SwapTwoValues {
public static void main(String[] args) {
	ArrayList<String> arrList= new ArrayList<>();
	arrList.add("dog");  
	arrList.add("cat");  
	arrList.add("rat");  
	arrList.add("bat");  
	arrList.add("bird");  
	System.out.println(swapTwoVal(arrList, 4, 0));
}
public static ArrayList<String> swapTwoVal (ArrayList<String> arrList, int j, int k){
	String temp1 = arrList.get(j);
	String temp2 = arrList.get(k);
	
	for (int i = 0; i < arrList.size(); i++) {
		if (i == j) {
			arrList.set(i, temp2);
		}
		if (i == k) {
			arrList.set(i, temp1);
		}
	}
	return arrList;
}
}
