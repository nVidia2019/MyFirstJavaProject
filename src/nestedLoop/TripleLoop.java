package nestedLoop;

public class TripleLoop {
public static void main(String[] args) {
	
	for (int num = 1; num <= 5; num++) {
		for (int spaceCount = 1; spaceCount <= (5 - num); spaceCount++) {
			System.out.print(" ");
			}
		for (int numCount = 1; numCount <= num; numCount++) {
			System.out.print(num);
			}
	System.out.println();
	}	
}
}
