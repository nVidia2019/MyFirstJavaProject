package staticPractice;

public class Calculator {
	
	
	public String operation; 
	
	public static double plus (double num1, double num2) {
		return num1 + num2;
	}
	
	public static double minus (double num1, double num2) {
		return num1 - num2;
	}
	
	public double multiply (double num1, double num2) {
		return num1 * num2;
	}
	
//	public static void multiply2 (double num1, double num2) {
//		System.out.println( multiply2(num1, num2));  <=== this won't compile as this static method is trying to use non-static method
//	}
}
