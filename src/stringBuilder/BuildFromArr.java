package stringBuilder;

public class BuildFromArr {
public static void main(String[] args) {
	String[] arr = {"a", "b", "c"};
	System.out.println(buildFromArr(arr));
}
public static StringBuilder buildFromArr (String[] arr) {
	StringBuilder stb = new StringBuilder();
	for (String str: arr) {
		stb.append(str);
	}
	return stb;
}
}
