package arrayList;

import java.util.*;

public class RemoveIntValue {
public static void main(String[] args) {
	ArrayList <Integer> arrList = new ArrayList<>();
	arrList.add(1);
	arrList.add(1);
	arrList.add(2);
	arrList.add(5);
	arrList.add(6);
	arrList.add(1);
	arrList.add(6);
	arrList.add(6);
	int i = 1;
	removeIntValue(arrList, i);
	System.out.println(arrList);
}
public static ArrayList<Integer> removeIntValue (ArrayList <Integer> arrList, int num) {
	for (int i = 0; i<arrList.size(); i++) {
		if (arrList.get(i) == num) {
			arrList.remove(i);
			i--;
		}
	}
	return arrList;
}
}
