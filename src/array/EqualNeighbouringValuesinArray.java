package array;

public class EqualNeighbouringValuesinArray {
public static void main(String[] args) {
	int[] numbers = {1, 5, 5, 2, 3, 9, 5, 9, 5, 5};
	// check if there is at least one case when 5 is next to another 5
	
	boolean found = false;
	for (int i = 0; i < numbers.length - 1; i++ ) { // it must check THE LAST BUT ONE  with the last and break
		if (numbers[i] == 5 && numbers[i + 1] == 5) {
			found = true;
			break; 
		}
	}
	System.out.println(found);
}
}
