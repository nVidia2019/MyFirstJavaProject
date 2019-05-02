package returnMethod;

import java.util.Scanner;

public class CubeNumber {
public static void main(String[] args) {
	Scanner input = new Scanner (System.in);
	System.out.println("Enter a number: ");
	int num = input.nextInt();
	System.out.println("Your number cubed value is: " + getCubeNum(num));
}

public static int getCubeNum (int n) {
	n = n*n*n;
	return n;
}
}
