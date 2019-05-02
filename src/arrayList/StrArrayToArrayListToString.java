package arrayList;

import java.util.*;

public class StrArrayToArrayListToString {
public static void main(String[] args) {
	String[] arr1 = {"boo", "kaboo"};
	String[] arr2 = {"doo", "goo"};
	System.out.println(combineR(arr1, arr2));
}
public static String combineR (String[] arr1, String[]arr2) {
	String ret = "";
	ArrayList <String> arrList = new ArrayList<>();
	List <String> temp1 = Arrays.asList(arr1);// <====
	List <String> temp2 = Arrays.asList(arr2);// <====
	arrList.addAll(temp1);
	arrList.addAll(temp2);
	
	for (String str: arrList) {
		ret += str + " ";
	}
	return ret;
}
}
