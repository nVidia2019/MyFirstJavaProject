package stringBuilder;

public class AppendAlphabet {
public static void main(String[] args) {
	char ch = 'A';
	ch++;
	System.out.println(ch);
	StringBuilder stb = new StringBuilder();
	for (char chars = 'A'; chars <= 'z'; chars++) {
		stb.append(chars);
	}
	System.out.println(stb);
}
}
