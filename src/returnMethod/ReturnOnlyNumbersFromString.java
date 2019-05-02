package returnMethod;

public class ReturnOnlyNumbersFromString {
public static void main(String[] args) {
	String str = "gfg212fg45";
	System.out.println(onlyDigits(str));
}
public static String onlyDigits (String str) {  /// <=== Task11
	String str2 = "";
	for (int i = 0; i < str.length(); i++) {
		if (Character.isDigit(str.charAt(i))){
			str2 += str.charAt(i);
		}
	}
	return str2;
}
}
