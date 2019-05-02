package forLoop;

import java.util.Scanner;

public class Register {
public static void main(String[] args) {
	int items;
	String itemName = "";
	int itemN = 1;
	String allItems = "";
	double totalPrice = 0;
	Scanner input = new Scanner(System.in);
	
	System.out.println("How many items are you purchasing?");
	items = input.nextInt();
	
	do {
		System.out.println("What is item #" + itemN + "?");
		itemName = input.nextLine();
		System.out.println("What is item #" + itemN + " price?");
		double price = input.nextDouble();
		totalPrice += price;
		items --;
		allItems += itemName + ", ";
		itemN ++;
		
	}while(items != 0);
	allItems = allItems.substring(0, allItems.length() - 2);
	System.out.println("Your items are: " + allItems + ".");
	System.out.println("Your total is: " + "$" + totalPrice);
}

}
