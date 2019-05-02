package array;

public class SearchInArray {
public static void main(String[] args) {
	int[] numbers = {10, 20, 30, 40, 100, 50, 80, 100};	
	int lookFor = 100;
	boolean found = false;
	
	for (int ind = 0; ind < numbers.length; ind++) {
			if (numbers[ind] == lookFor) {
				System.out.println(lookFor + " was found at index " + ind);
				found = true;
				
			}
	}
	if (!found) { // <== you have to check outside the loop if it's still false
				System.out.println(lookFor + " was not found");
			}
	} 
	
	
}

