package whileLoop;

import java.util.Scanner;

public class Practice2 {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Please enter a number:");
	int number = input.nextInt();
	int count = 1;
	
	while (count <= number) {
		System.out.println(count + ", ");
		count ++;
	}
}
}
