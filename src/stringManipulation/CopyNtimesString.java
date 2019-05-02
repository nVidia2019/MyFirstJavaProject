package stringManipulation;

public class CopyNtimesString {
public static void main(String[] args) {
	String str = "Hi!";
	int n = 3;
	String str2 = "";
	for (n = 0; n <3; n++) {
		str2 += str;
	}
	System.out.println(str2);
}
}
