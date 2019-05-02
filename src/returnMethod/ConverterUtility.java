package returnMethod;

import java.util.Scanner;

public class ConverterUtility {
public static void main(String[] args) {
	System.out.println("Enter number of miles:");
	Scanner input = new Scanner(System.in);
	double miles = input.nextDouble();
	System.out.println(miles + " miles equals to: " + milesToKm(miles) + " km.");
	
	System.out.println("Enter number of degrees Fahrenheit:");
	Scanner input2 = new Scanner(System.in);
	double farenHeit = input.nextDouble();
	System.out.println(farenHeit + " degrees Fahrenheit equals to: " + fahrenheitToCelsius(farenHeit) + " degrees Celsius.");
	
}

public static double milesToKm (double miles) {
	double km = miles * 1.6; // you can also call a custom method to calculate ===> double km = Calculator2.multiply(miles, 1.6);
	return km;
}

public static double fahrenheitToCelsius(double farenHeit) {
	double celcius = (farenHeit - 32) * 5/9;
	return celcius;
}
}
