package methods;

import java.util.Scanner;

public class Plus {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Enter two digits you wnat to add:");
	int int1 = input.nextInt();
	int int2 = input.nextInt();
	System.out.println("The sum of entered digits is: ");
	plus(int1, int2);
}

public static void plus(int num1, int num2) {
	System.out.println(num1 + num2);
}
}  
