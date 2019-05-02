package array;

public class CountEvenInArray {
public static void main(String[] args) {
	int [] arr = {0, 1, 2, 3, 4, 5};
	int count = 0;
	for (int i : arr) {
		if (i % 2 == 0) {
			count +=1;
		}
	
	}
	System.out.println("Number of even numbers in array is: " + count);
}
}
