package array;

public class FindTheBiggest {
public static void main(String[] args) {
	double[] prices = {12.45, 45, 48.50, 78.56, 7.8, 8};
	double highest = prices[0];
	double lowest = prices[0];
	
	for (int ind = 0; ind < prices.length; ind++) {
		if (prices[ind] >= highest) {
			highest = prices[ind];
			}

		if (prices[ind] <= lowest) {
			lowest = prices[ind];
			}
	}
	System.out.println("The highest price is " + "$" + highest);
	System.out.println("The lowest price is " + "$" + lowest);
}
}
