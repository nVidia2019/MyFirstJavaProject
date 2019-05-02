package forLoop;

import java.util.Scanner;

public class Task6 {
public static void main(String[] args) {
	 Scanner input = new Scanner(System.in);
	 int times = 1;
	 int sum = 0;
	 int biggest = 0;
	 while (times <= 3) {
		 System.out.println("Please enter a number: ");
		 int num = input.nextInt();
		 sum += num;
		 if (biggest < num)
		 	{
			 biggest = num;
		 	}
		 times++;
	 }
	System.out.println("Sum: " + sum);	
	System.out.println("The biggest number: " + biggest);
}
}
