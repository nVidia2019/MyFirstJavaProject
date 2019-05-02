package array;

public class SplitStringNumofWord {
public static void main(String[] args) {
	
	String searchResults = "All categories 'wooden spoon' 13,623 Results.";
	String[] splitWords = searchResults.split(" ");
	int num = splitWords.length;
	System.out.println("Words count: " + num);
	
	//another way:
	System.out.println(searchResults.split(" ").length);
	
	//to print a specific word in array:  
	System.out.println("Wooden spoon count: " + splitWords[4]);
}
}
