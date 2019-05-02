package stringManipulation;

public class SwapFirstLast {
public static void main(String[] args) {
	String str = "table";
	System.out.println(swapFirstLast(str));
	System.out.println(swapFirstLast2(str));
}

public static String swapFirstLast (String str) {
	str = str.substring(str.length()-1)+ str.substring(1, str.length()-1) + str.substring(0,1);
	return str;
}

public static String swapFirstLast2 (String str) {
	char firstChar = str.charAt(0);
	for (int i = 0; i < str.length(); i++) {
		if (i == 0) {
			str = str.replace(str.charAt(0), str.charAt(str.length()-1));
			System.out.println(str);
			}
		 str.replace(str.charAt(str.length()-1), firstChar);
	}
	
	return str;
}
}
