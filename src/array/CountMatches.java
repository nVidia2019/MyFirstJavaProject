package array;

public class CountMatches {
public static void main(String[] args) {
	double[] prices = {12.45, 45.00, 48.50, 78.56, 7.80, 8.00};
	double price1 = 100.00;
	boolean found = false;
	
	for (int ind = 0; ind < prices.length; ind++) {
		if (prices[ind] > price1) {
			System.out.println("Price over over $20.00 was found: " + prices[ind]);
			found = true;
}
}
	if (!found) {
		System.out.println("No prices over " + "$" + price1);
	}
}
}
