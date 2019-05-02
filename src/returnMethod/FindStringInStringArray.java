package returnMethod;

public class FindStringInStringArray {
public static void main(String[] args) {
	String[] arr = {"dog", "cat", "mouse", "cat", "cat", "dog"};
	String str = "cat";
	System.out.println("Your " + str + " occurs " + countString(arr, str) + " times in your array");
}

public static int countString (String [] arr, String str) {
	int count = 0;
	for (String word : arr) {
		if (word == str) {
			count +=1;
		}
	}
	return count;
}
}
