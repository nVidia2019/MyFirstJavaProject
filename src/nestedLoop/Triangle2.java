package nestedLoop;

public class Triangle2 {
	public static void main(String[] args) { // code is not finished
		
	
	for (int num = 1; num <= 5; num++) {
		for (int spaceCount = 1; spaceCount <= (5 - num); spaceCount++) {
			System.out.print(" ");
			}
		for (int starCount = 1; starCount <= num *2 + 1; starCount++) {
			System.out.print("*");
			}
	System.out.println();
	}
}
}