package stringBuilder;

public class Intro {
public static void main(String[] args) {
	StringBuilder stb1 = new StringBuilder("Halloween");
	System.out.println(stb1);
	
	StringBuilder stb2 = new StringBuilder();
	stb2.append("java");
	System.out.println(stb2);
	stb2.append(", SQL").append(", HTML");
	System.out.println(stb2);
}
}
