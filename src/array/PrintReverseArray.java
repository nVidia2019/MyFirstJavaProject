package array;

public class PrintReverseArray {
public static void main(String[] args) {
	String gift = "Diamond ring";
	gift = gift.replaceAll(" ", "");
	
	char[] letters2 = gift.toCharArray(); // <=== String is transformed into array
	System.out.println("Original way: ");
	for (int ind = 0; ind < letters2.length; ind++ ) {
		System.out.print(letters2[ind] + " ");
	}
}
}
