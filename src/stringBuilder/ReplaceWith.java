package stringBuilder;

public class ReplaceWith {
public static void main(String[] args) {
	String[] arr = {"a", "b", "a", "b", "c"};
	String str1 = "b";
	String str2 = "a";
	
	System.out.println(replaceWith(arr, str1, str2));
}
public static StringBuilder replaceWith(String[] arr, String str1, String str2) {
	StringBuilder stb = new StringBuilder();
	for (String s: arr) {
		if (s.equals(str1)) {
			s = s.replace(str1, str2);
		}
		stb.append(s);
	}
	return stb;
}
}

