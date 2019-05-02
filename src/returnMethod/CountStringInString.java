package returnMethod;

public class CountStringInString {
public static void main(String[] args) {
	String str1 = "java methods like me";
	String str2 = "0";
//	System.out.println("String 2 occurs " + countStringInString(str1, str2) + " time(s) in String 1.");
	printStrWithSqBr(str1, str2);
}
//public static int countStringInString (String str1, String str2) { //<=== counts how many times String2 occurs in String1
//	String str3 = "[" + str2 +"]"; 
//	int count = 0;
//	str1 = str1.replaceAll(str2, str3);
//	for (int i = 0; i < str1.length(); i++) {
//		if (str1.charAt(i) == '[') {
//			count++;
//		}
//	}
//	return count;
//}
public static void printStrWithSqBr (String str1, String str2) {   // Task7
	if (str1.contains(str2)) {
		String str3 = "[" + str2 +"]"; 
		str1 = str1.replaceAll(str2, str3);
		System.out.println(str1);
	}else {
		str1 = "[" + str1 + "]";
		System.out.println("String 2 doesn't occur in String 1: " + str1);
	}
}
}