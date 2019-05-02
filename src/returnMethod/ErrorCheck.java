package returnMethod;

import java.util.Arrays;

public class ErrorCheck {
public static void main(String[] args) {
	String str = "error gfjkgj 4gf54g";
	System.out.println(isError(str));
}
public static boolean isError (String str) { // <=== Task 12
	str = str.toLowerCase();
	String[] arr = str.split(" ");
	if (arr[0].equals("error")){
		return true;
	}
	return false;
}
}
