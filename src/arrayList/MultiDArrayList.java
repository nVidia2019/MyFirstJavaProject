package arrayList;

import java.util.*;

public class MultiDArrayList {
public static void main(String[] args) {
	ArrayList<ArrayList<String>> twoDArrayList = new ArrayList<ArrayList<String>>();
	ArrayList<String> x = new ArrayList<>();
	ArrayList<String> y = new ArrayList<>();
	x.add("a");
	x.add("b");
	y.add("c");
	y.add("d");
	twoDArrayList.add(x);
	twoDArrayList.add(y);
	System.out.println(twoDArrayListToString(twoDArrayList));
}
public static String twoDArrayListToString (ArrayList<ArrayList<String>> twoDArrayList) {
	String str = "";
	for (int i = 0; i < twoDArrayList.size(); i++)	{
		for (int j = 0; j < twoDArrayList.get(i).size(); j++) {
			str+= twoDArrayList.get(i).get(j);
		}
	}
	return str;
}	
}
