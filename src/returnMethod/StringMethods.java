package returnMethod;

public class StringMethods {
public static void main(String[] args) {
	String str = "java";
	System.out.println(reverseString(str));
	
	String str1 = "Level";
	if (palindrome(str1)) {  // <=== if condition is true
		System.out.println("Your word " + str1 + " is a palindrome.");
	}else {
		System.out.println("Your word " + str1 + " is not a palindrome.");
	}
}

public static String reverseString (String str) {  // <=== Task 10
	String reverSe = "";
	for (int i = str.length() - 1; i >= 0; i--) {
		reverSe += (str.charAt(i));
	}
	return reverSe;
}

public static boolean palindrome (String str) {
	str = str.toLowerCase();
	String reversE = "";
	for (int i = str.length() - 1; i >= 0; i--) {
		reversE += (str.charAt(i));
	}
	if (reversE.equals(str)) // you can also put it as: return str.equalsIgnoreCase(reversE)  ===> this statement anyway returns a boolean.
		return true;         // you can also put it as: return reverseString(str).equalsIgnoreCase(str) ===> we call another custom method
	return false;                            // reverseString and the result of this statement is a boolean.
}
}
