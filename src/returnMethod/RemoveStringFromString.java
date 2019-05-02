package returnMethod;

public class RemoveStringFromString {
public static void main(String[] args) {
	String str1 = "one two three";
	String str2 = "one";
	System.out.println(removeStr(str1, str2));
	int n = 3;
	System.out.println(removeStrNum(str1, n));
	
	String str5 = "computer";
	String str6 = "cat";
	System.out.println(at3(str5, str6));
	System.out.println(getBiggest(str1, str2));
 } 
public static String removeStr (String str1, String str2) {// remove a String from a String
	return str1.replaceAll(str2, "").trim();  // <=== Task2 and 8
}

public static String removeStrNum (String str, int n) {
	return str.substring(0, n);   // <=== Task3
}

public static String at3 (String str1, String str2) {
	return str1.substring(0, 3) + str2 + str1.substring(3); // <===Task4
	
}
public static String getBiggest (String str1, String str2) { // <===Task5
	if (str1.length() > str2.length())
		return str1;
	return str2;
}
}
