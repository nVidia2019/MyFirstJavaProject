package multiDimensionalArray;

import java.util.Arrays;

public class Creating2DArrays {
	public static void main(String[] args) {
		double[][] prices = new double[3][]; 
		prices[0] = new double [] {234.00, 56.00, 789.56};
		prices[1] = new double [] {235.32, 954.00};
		prices[2] = new double[5];
		prices[2][0] = 78;
		prices[2][1] = 89.35;
		prices[2][2] = 789.56;
		prices[2][3] = 654.00;
		prices[2][4] = 8;
		System.out.println(Arrays.toString(prices[0]));
		System.out.println(Arrays.toString(prices[1]));
		System.out.println(Arrays.toString(prices[2]));
		System.out.println(Arrays.deepToString(prices));
	}
	}
