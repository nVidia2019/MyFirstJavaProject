package stringBuilder;

public class PostSize {
public static void main(String[] args) {
	String[] arr = {"abc", "foo bar", "123"};
	int size = 5;
	System.out.println(postsGenerate(arr, size));
	
}
public static StringBuilder postsGenerate (String[] arr, int size) {
	StringBuilder stb = new StringBuilder ();
		for (String str : arr) {
			if (str.length() <= size) {
				stb.append(str + "<br>");
			}else {
				continue;
			}
		}
		return stb;
}
}
