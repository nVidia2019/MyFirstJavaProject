package methods;

public class Steps {
public static void main(String[] args) {
	int steps = 0;
	steps(steps);
}

public static void steps(int int1) {
	
		if (int1 < 0) {
			int int2 = int1*-1;
			while (int1 < 0) {
			System.out.println("Jump " + int2);
			int1++;
			int2--;
			}
			return;
		}
		if (int1 > 0) {
			int zero = 1;	
			while (zero <= int1) {
				System.out.println("Step " + zero);
				zero++;
			}
			return;
		}
		if (int1 == 0) {
			System.out.println("Sit");
		}
	}
}


