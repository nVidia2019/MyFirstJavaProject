package array;

public class ArraysPrintFirstandLast {
public static void main(String[] args) { // print only first and last character of Strings in the Array
	
	String[] words = {"hello", "hey", "boy", "java", "bye"};
	
	for (String w : words) {
		System.out.print(w.charAt(0)+ "" + w.charAt(w.length() - 1) + " ");//adding empty string prevents from Java adding values of chars while we concatenate 2 chars
		
	}
}
}
// the same task, but with substrings
//for (String w : words)
//System.out.println(w.substring(0, 1))  <== first character
//System.out.println(w.substring(w.length() - 1))   <== last character