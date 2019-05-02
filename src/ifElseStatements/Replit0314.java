package ifElseStatements;

import java.util.Scanner;

public class Replit0314 {

	public static void main(String[] args) {
	    
	    System.out.println("Please enter:");
	    Scanner scanner = new Scanner(System.in);
	    int n = scanner.nextInt();
	    boolean condition;
	    
	    // Your code here
	    //----------------------------------------------
	    // NOTE: Please assign and use boolean inside the if statement Ex: if(condition) {}
	    // You may require more than one boolean, feel free to create instance variables
	    condition = (n % 2 == 1);
	    if (!condition && n > 20) {
	      System.out.println("Weird");
	    }
	    else if (!condition && n <= 2 && n <= 5) {
	    	System.out.println("Not Weird");
	    }
	    else if (!condition && n <= 6 && n >= 20) {
	    	System.out.println("Weird");
	    }
	    else {
	    		System.out.println("Weird");
	    	}
	    }
	    
	    }
	    

