package arrayList;

import java.util.*;

public class RepeatAll {
public static void main(String[] args) {
	ArrayList<Boolean> arrList = new ArrayList<>();
	arrList.add(true);
	arrList.add(false);
	arrList.add(false);
	
	repeatAll(arrList);
	System.out.println(arrList);
}
public static void repeatAll(ArrayList<Boolean> arrList){
	arrList.addAll(arrList);
}
}
