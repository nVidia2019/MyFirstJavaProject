package arrayList;

import java.util.*;

public class RemoveValue {
public static void main(String[] args) {
	ArrayList <String> arrList = new ArrayList<>();
	arrList.add("bat");
	arrList.add("cat");
	arrList.add("mat");
	arrList.add("dog");
	arrList.add("bat");
	arrList.add("456");
	String str = "bat";
	removeString(arrList, str);
	System.out.println(arrList);
}
public static void removeString (ArrayList <String> arrList, String str) {
	for (int i = 0; i<arrList.size(); i++) {
		if (arrList.get(i).equals(str)) {
			arrList.remove(i);
		}
	}
}
}
