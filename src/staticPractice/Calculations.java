package staticPractice;

public class Calculations {
public static void main(String[] args) {
	System.out.println(Calculator.plus(5, 3));
	System.out.println(Calculator.plus(50, 3));
	
	
	Calculator calc1 = new Calculator();
	System.out.println(calc1.multiply(5, 3));
	System.out.println(calc1.plus(8, 2)); //<=== but you don't necessarily need the object here
	
	// Calculator.operation = "add"; //<=== this will not work as variable is not static, but you try to use it inside static method
	
	calc1.operation = "math calculation";
	
}
}
