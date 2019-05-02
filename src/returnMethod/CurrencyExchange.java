package returnMethod;

import java.util.Arrays;

public class CurrencyExchange {
public static void main(String[] args) {
	String [][] amounts = {  {"drakhma", "10"}, {"mark","20"}, {"hryvnia","50"} }; 
	String [][] convRates = { {"hryvnia", "1"}, {"mark","3"}, {"drakhma", "2"} };
	System.out.println(currencyExchange(amounts, convRates));
}

public static double currencyExchange (String amounts [][], String convRates [][]) {
	double sum = 0;
	for (int i = 0; i < amounts.length; i++) {
		 for (int j = 0; j <convRates.length; j++) {
			 if (amounts[i][0].equals(convRates[j][0])) {
				 sum += Double.parseDouble(amounts[i][1]) * Double.parseDouble(convRates[j][1]);
			 }
		 }
	}  
	return sum;
}
}
