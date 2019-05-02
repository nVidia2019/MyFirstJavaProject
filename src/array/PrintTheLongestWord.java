package array;

public class PrintTheLongestWord {
public static void main(String[] args) {
	String [] words = {"four", "it", "one", "seven", "multiple", "bananas"};
	String longest = "";
	for (String w : words) {
		if (w.length() >= longest.length()) {
			longest = w;
		}
	}
	System.out.println("Your longest word in Array is: " + longest);
		
}
}
