package arrayList;

import java.util.*;

public class RemoveEveryOther {
public static void main(String[] args) {
	ArrayList <String> arrList = new ArrayList <>();
	arrList.add("cat");
	arrList.add("dog");
	arrList.add("rat");
	arrList.add("bat");
	arrList.add("bird");
	removeEveryOther(arrList);
	System.out.println(arrList);
}

public static void removeEveryOther (ArrayList <String> arrList){

	for (int i = 0; i < arrList.size(); i++) {
		if (i % 2 == 0) {
			arrList.set(i, "*");
		}
	}
	for (int i = 0; i < arrList.size(); i++) {
		if (arrList.get(i).equals("*")) {
			arrList.remove(i);
		}
	}
}
}