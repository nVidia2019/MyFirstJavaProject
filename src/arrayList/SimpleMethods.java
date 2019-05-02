package arrayList;

import java.util.*;

public class SimpleMethods {
public static void main(String[] args) {
	ArrayList<String> arrList = new ArrayList<>();
	arrList.add("Hello");
	arrList.add("Bye");
	arrList.add("banana");
	arrList.set(0, "Hi");
	System.out.println(arrList);
	arrList.set(0, "Hey");
	arrList.set(2, "Yo");
	System.out.println(arrList);
}
}
