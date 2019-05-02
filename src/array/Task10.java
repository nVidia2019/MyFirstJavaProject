package array;

public class Task10 {
public static void main(String[] args) {
	int[] numbers = {1, 7, 5, 8, 9, 7, 0, 7};

	
	boolean found = false;
	for (int i = 0; i < numbers.length - 2; i++ ) { //<== only the last but one value is checked 
		if (numbers[i] == 7 && numbers[i + 1] == 7) {
			found = true;
			break; 
		}
		if (numbers[i] == 7 && numbers[i + 2] == 7) {
			found = true;
			break; 
		}
	}
	System.out.println(found);
}
}
