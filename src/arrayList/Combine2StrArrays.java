package arrayList;

import java.util.*;

public class Combine2StrArrays {
public static void main(String[] args) {
	String[] arr1 = {"f", "o", "o"};
	String[] arr2 = {" b", "a", "r"};
		
	System.out.println(combineTwoStrArrays(arr1, arr2));
}
public static String combineTwoStrArrays (String[] arr1, String[] arr2){
	ArrayList<String> arrList1 = new ArrayList<>();
	ArrayList<String> arrList2 = new ArrayList<>();
	
	for (int i = 0; i < arr1.length; i++) {
		arrList1.add(arr1[i]);
	}
	for (int i = 0; i < arr2.length; i++) {
		arrList2.add(arr2[i]);
	}
	arrList1.addAll(arrList2);
	String str = "";
	for (int i = 0; i < arrList1.size(); i++) {
		str += arrList1.get(i);
	}
	return str;
}
}
