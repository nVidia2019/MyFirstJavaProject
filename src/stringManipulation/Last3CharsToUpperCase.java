package stringManipulation;

public class Last3CharsToUpperCase {
public static void main(String[] args) {
	String str = "hello";
	int l = str.length();
	String first = "";
	String last3 = "";
	if (l <= 3) {
		str = str.toUpperCase();
	}else{
		for (int i = l - 3; i < l; i++)
			last3 += str.charAt(i);
		}
		for (int j = 0; j < l - 3; j++) {
			first += str.charAt(j);
		}
	last3 = last3.toUpperCase();
	System.out.println(first+last3);
	}
}

