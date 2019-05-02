package returnMethod;

public class UniqueCharacterInString {
public static void main(String[] args) {
	String str = "fgdjhfurfh";
	char char1 = 'a';
	System.out.println(findUnuqueChar(str, char1));	
	
}
public static String findUnuqueChar (String str, char char1) {  // Task6
	String strTemp = "";
	for (int i = 0; i < str.length(); i++) {
		if (strTemp.indexOf(str.charAt(i)) == -1) { //<== if char is not present in a String its index will be -1; 
			strTemp = strTemp + str.charAt(i);    //<== if char is occurs 2 or more times its index is 0.
		}
	}
	return strTemp;
}
}
