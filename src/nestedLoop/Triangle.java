 package nestedLoop;

public class Triangle {
public static void main(String[] args) {
	int i = 10;
	while (i >=1) {
		for (int n = 1; n <= i; n++) {
			System.out.print("* ");
	}
		System.out.println();
		i--;
	}
	}
}
