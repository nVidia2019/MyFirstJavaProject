package nestedLoop;

public class TripleLoop2 {
public static void main(String[] args) {
	
	for (int num = 5; num >= 1; num--) {
		for (int spaceCount = 0; spaceCount <= (5 - num); spaceCount++) {
			System.out.print(" ");
		}
		for (int numCount = 1; numCount <= 5; numCount ++) {
			System.out.print(num);
		}
		System.out.println();
	}
	}
}
