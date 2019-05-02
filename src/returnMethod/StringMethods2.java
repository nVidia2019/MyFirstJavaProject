package returnMethod;

import java.util.Arrays;

public class StringMethods2 {
public static void main(String[] args) {
	String str1 = "Java";
	String str2 = "a";
	System.out.println(str2 + " occurs " + countTimes2(str1, str2) + " in " + str1);
}

public static int countTimes (String str1, String str2) { //<=== str2 is a single !!! character String
		int length1 = str1.length();   
		str1 = str1.replace(str2, "");
		int length2 = str1.length();
		return length1 - length2;
}	

public static int countTimes2 (String str1, String str2) {// <=== you can also compare substring of str1 and str2
		int count = 0;
		for (int i = 0; i < str1.length(); i++ ) {
			if (str1.substring(i, i+1).equals(str2)) {
				count++;
			}
		}
		return count;
}
}
