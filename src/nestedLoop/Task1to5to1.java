package nestedLoop;

public class Task1to5to1 {
public static void main(String[] args) {

	for (int outer = 1; outer <=5; outer++) {
		for (int inner = 1; inner <= outer; inner++) {
			System.out.print(outer + " ");
		}
		System.out.println();
	}
	
	for (int i3 = 4; i3 >=1; i3--) {
		for (int i4 = 1; i4 <= i3; i4++) {
			System.out.print(i3 +  " ");
		}
		System.out.println();
	}
}
}
