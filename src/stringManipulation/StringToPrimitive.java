package stringManipulation;

import java.util.*;

public class StringToPrimitive {
public static void main(String[] args) {
	String str = "32";
	int num = Integer.valueOf(str);
	int num2 = Integer.parseInt(str);
	
	String str2 = "Price is 50.50";
	String[]arr = str2.split(" ");
	double price = Double.parseDouble(arr[arr.length-1]);
	System.out.println(price);
	String etsyResults = "'wooden spoon' (13,950 Results)";
	String[] etsyArray = etsyResults.split(" ");
	String strResult = etsyArray[2].replace("(", "").replace(",", "");
	int results = Integer.parseInt(strResult);
	System.out.println(results);
	
	String[] arrNums = {"234", "345", "678"};
	ArrayList<Integer> listNums = new ArrayList<>();
	
	for (String n : arrNums) {
		listNums.add(Integer.valueOf(n));
	}
	System.out.println(listNums);	
}
}
