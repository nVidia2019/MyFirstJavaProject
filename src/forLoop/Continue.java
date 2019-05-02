package forLoop;

public class Continue {
	 public static void main(String[] args) {
		for (int k = 1; k <= 50; k ++) {
			if (k % 20 == 0) {
				break;
			}
			if (k % 5 == 0) {
				continue;
			}
			
			System.out.print(k + " ");
		}
	}
}
