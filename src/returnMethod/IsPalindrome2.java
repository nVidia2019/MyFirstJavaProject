package returnMethod;

public class IsPalindrome2 {
public static void main(String[] args) {
	String str = "civic";
	System.out.println(isPalindrome(str));
}
public static boolean isPalindrome (String str) {
	str = str.toLowerCase();
	boolean equal = true;
		for (int i = 0; i < str.length(); i++) {
		if (str.charAt(i) != str.charAt(str.length() - (i+1))){
			equal = false;
			break;
		}
		equal = true;
	}
	return equal;
}
}
