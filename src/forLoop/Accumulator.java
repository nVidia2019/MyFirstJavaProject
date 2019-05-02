package forLoop;

public class Accumulator {
public static void main(String[] args) {
	int i;
	int sumOfOdds = 0;
	int sumOfEvens = 0;
	
	for (i = 0; i <= 100; i++) {
		if (i % 2 == 0) {
			sumOfEvens += i;
		}
		else {
			sumOfOdds += i;
			}
		}
	System.out.println("Sum of Evens: " + sumOfEvens);
	System.out.println("Sum of Odds: " + sumOfOdds);
}
}
