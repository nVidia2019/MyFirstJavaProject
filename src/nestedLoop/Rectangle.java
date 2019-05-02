package nestedLoop;

public class Rectangle {
public static void main(String[] args) {
int ind = 2;	// error in the code, to review and correct later
	for (int n = 1; n <= 15; n++) {
		System.out.print("* ");
}
	System.out.println();
	for (int n = 1; n <= 13; n++) {
		System.out.print("*");
		ind ++;
		if (n == ind) {
			continue;
		}
		for (int s = 1; s <= 27; s++) {
			System.out.print(" ");
		}
	}
	}
}
