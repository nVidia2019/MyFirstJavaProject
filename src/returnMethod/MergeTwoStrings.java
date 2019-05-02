package returnMethod;

public class MergeTwoStrings {
public static void main(String[] args) {
	String str1 = "cat";
	String str2 = "computer";
	System.out.println(mergeStrings(str1, str2));
}
public static String mergeStrings (String str1, String str2) {
	String mergedStr = "";
	if (str1.length() > str2.length()) {
		for (int i = 0; i < str2.length(); i++) {
			mergedStr += str1.charAt(i);
			mergedStr += str2.charAt(i);
		}
		mergedStr += str1.substring(str2.length());
	}
	if (str2.length() > str1.length()) {
		for (int i = 0; i < str1.length(); i++) {
			mergedStr += str1.charAt(i);
			mergedStr += str2.charAt(i);
		}
		mergedStr += str2.substring(str1.length());
	}
	if (str1.length() == str2.length()) {
		for (int i = 0; i < str2.length(); i++) {
			mergedStr += str1.charAt(i);
			mergedStr += str2.charAt(i);
		}
	}
	return mergedStr;
}
}
