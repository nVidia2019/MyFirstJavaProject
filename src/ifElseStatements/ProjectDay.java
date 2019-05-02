package ifElseStatements;

import java.util.Scanner;


class ProjectDay {
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
		    
		     
		    
		    //==============================================
		    // Task 2
		    int price=0;
		    int quarter=0;
		    int dime = 0;
		    int nickle=0;
		  
		    System.out.println("Enter price in cents:");
		    price = input.nextInt();
		    
		    
		    



		    //----------------------------------------------
		    System.out.println("Your change is "+quarter+" quarters, "+dime+" dimes, and "+nickle+" nickels.");
		    
		    //==============================================
		    //Task 3
		    int numberOfCall;
		    double bill=0.0;
		    System.out.println("Enter number of calls:");
		    numberOfCall = input.nextInt();
		    
		    // your code here. (DO NOT change existing code)
		    //----------------------------------------------










		    
		    //----------------------------------------------
		    System.out.println("Your bill is $"+bill);
		    
		  }
		}