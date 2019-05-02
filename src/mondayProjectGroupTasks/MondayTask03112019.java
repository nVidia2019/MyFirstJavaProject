package mondayProjectGroupTasks;

import java.util.Scanner;

public class MondayTask03112019 {
	public static void main(String[] args) {
		
	

	// Task 1
    int unitPrice;
    int quantity;
    double grandTotal=0.0;
    int discount=0;
    double discountApplied=0.0;
    double total=0.0;
    
    Scanner input = new Scanner(System.in);
    
    System.out.println("Enter unit price:"); 
    unitPrice = input.nextInt();
    System.out.println("Enter quantity:");
    quantity = input.nextInt();
     
    
    if(quantity >= 100 && quantity <= 120) {
   discountApplied = ((unitPrice * quantity) * 10/100);
    discount = 10;
    }
    else if(quantity > 120) {
   discountApplied = ((unitPrice * quantity) * 15/100);
    discount = 15;
    }
    else {
    discountApplied = ((unitPrice * quantity) * 0);
    discount = 0;
    }
    grandTotal = unitPrice * quantity;
    total = unitPrice * quantity - discountApplied;
    System.out.println("Grand Total: $ "+ grandTotal);
    System.out.println("Discount: $ "+ discount);
    System.out.println("Discount applied: $ "+ discountApplied);
    System.out.println("Total: $ : " + total);

    //Task 2
    
    int price=0;
    int quarter=0;
    int dime = 0;
    int nickle=0;
  
    System.out.println("Enter price in cents:");
    price = input.nextInt();
    int change = 100 - price;
    quarter = change/25%25;
    dime = (change - (quarter * 25)) /10%10;
    nickle = (change -(quarter * 25) - (dime * 10))/5%5;

    
    //Task 3
    
    int numberOfCall;
    double bill=0.0;
    System.out.println("Enter number of calls:");
    numberOfCall = input.nextInt();
    
    if(numberOfCall <= 100) {
 	   bill = 200;
    }
    else if (numberOfCall > 100 && numberOfCall <= 150) {
 	   bill = 200 + ((numberOfCall-100)*60/100);
    }
    else if (numberOfCall > 150 && numberOfCall <= 200) {
 	   bill = 200 + (50*60/100) + ((numberOfCall - 150)* 50/100);
    }
    else {
 	   bill = 200 + (50*60/100) + (50*50/100) + ((numberOfCall - 200) * 40/100);
    }
}
}
	

