package arrayList;

import java.util.*;

public class SearchString {
public static void main(String[] args) {
	ArrayList<String> arrList = new ArrayList<>();
	arrList.add("one apple");
	arrList.add("two oranges");
	arrList.add("three bananas");
	String str = "One";
	System.out.println(searchString(arrList, str));
	
}
public static String searchString (ArrayList<String> arrList, String str) {
	for (String s: arrList) {
			if (s.toLowerCase().contains(str.toLowerCase())) {
			return s;
		}
	}
	return "Search failed!";
}
}
