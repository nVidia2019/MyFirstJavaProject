package stringManipulation;

public class StarChar {
public static void main(String[] args) {
	String str = "8*sd*dfd8";
	boolean starMatch = false;
	for (int i = 1; i < str.length(); i++)
		if (str.charAt(i) == '*' && str.charAt(i-1) == str.charAt(i+1)) {
			starMatch = true;
			break;
		}
	System.out.println(starMatch);
}
}
