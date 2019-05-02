package array;

public class ArrayCopyValues {
public static void main(String[] args) {
	String[] arr = {"zero", "one", "two", "three", "four"}; 
	int counter = 0;
	
	for (String str: arr) {
		if (str.contains("t")) {
			counter++;
		}
	}
	System.out.println(counter);
	// create a new array
	String[] fewValues = new String[counter];
	for (String str: arr) {
		if (str.contains("t")) {
			for (int i = 0; i < counter; i++) {
				fewValues[i] = str;
			}
			System.out.print(str + " "); 
		}
	}
	
}
}
 