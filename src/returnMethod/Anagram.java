package returnMethod;

public class Anagram {
public static void main(String[] args) {
	String str1 = "listen";
	String str2 = "Silent";
	System.out.println(isAnagram(str1, str2));
}
public static boolean isAnagram (String str1, String str2) {
	boolean isAnagram = false;
	str1 = str1.toLowerCase();
	str2 = str2.toLowerCase();
	if (str1.length() == str2.length()) {
		for(int i = 0; i < str1.length(); i++) {
			if (str2.contains(str1.substring(i, i+1))) {
				isAnagram = true;
			}
		}
	}else {
		return isAnagram;
	}
	return isAnagram;
}
}
