package mondayProjectGroupTasks;

import java.util.Scanner;

public class MondayTask03042019 {
	
	public static void main(String[] args) {
		// Task 1
		int age = 25;
		double weight = 55.5;
		String greeting = "Welcome to Java tasks!";
		System.out.println("String: " + greeting);
		System.out.println("Double: " + weight);
		System.out.println("Int: " + age);

		//Task 2
		int width;
		int length;
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter width: ");
		width = input.nextInt();
		System.out.println("Please enter lenth: ");
		length = input.nextInt();
		System.out.println("Area of rectangle: " + width * length);
		System.out.println("Perimeter of rectangle: " + 2 * (width + length));
			}
   
}
