package stringBuilder;

public class ToBe {
public static void main(String[] args) {
	StringBuilder stb = new StringBuilder ("true,true");
	System.out.println(toBe(stb));
}
public static boolean toBe (StringBuilder stb) {
	String str = stb.toString();
	String[] arr = str.split(",");
	boolean result = false;
	for (String s : arr) {
		if (s.contains("true"))
			result = true;
		else
		result = false;
	}
	return result;
}
}
