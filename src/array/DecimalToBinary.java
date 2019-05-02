package array;

import java.util.Arrays;
import java.util.Scanner;

public class DecimalToBinary {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Enter a number up to 255:");
	int num = input.nextInt();
	int[] binary = new int [8]; // converter up to 255 (binary code with 8 digits max)

	for (int i = binary.length - 1; i >= 0; i--) {
		binary[i] = num % 2;
		num /=2;
	}
System.out.println(Arrays.toString(binary));

}
}
