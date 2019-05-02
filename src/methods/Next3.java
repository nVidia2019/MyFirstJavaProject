package methods;

import java.util.Scanner;

public class Next3 {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Enter a number:");
	int num = input.nextInt();
	next3(num);
}


 
public static void next3(int num) {
	for (int i = 0; i < 3; i++) {
		num +=1;
		System.out.print(num + " ");
	}
}
}
