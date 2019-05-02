package array;

public class PrintReverseFromString {
public static void main(String[] args) {
	String str = "Java is fun";
	String [] split = str.split(" ");
	
	for (int i = split.length - 1; i >= 0; i--) {
		System.out.print(split[i] + " ");
	}
		
}
}
