package operators;

import java.util.Scanner;

public class Replit1 {
	 public static void main(String[] args) {
		 System.out.println("   ^   ");
		 System.out.println("  " + "/" + "|" + "\\ ");
		 System.out.println(" / " + "|" + " \\ ");
		 System.out.println("/  " + "|" + "  \\");
		 System.out.println("|  " + "|" + "  |");
		 System.out.println("|  " + "|" + "  |");
		 System.out.println("|  " + "|" + "  |");
		 System.out.println("|  " + "|" + "  |");
		 System.out.println("|  " + "|" + "  |");
		 System.out.println("|  " + "|" + "  |");
		 System.out.println("|  " + "|" + "  |");
		 System.out.println("|  " + "|" + "  |");
		 System.out.println("|  " + "|" + "  |");
		 System.out.println("|  " + "|" + "  |");
		 System.out.println("|  " + "|" + "  |");
		 System.out.println("|  " + "|" + "  |");
		 System.out.println("-------");
		 
		 			    //DO NOT TOUCH THESE LINES. TEACHER NEEDS THEM TO TEST YOUR CODE:
			    String p1 = "James";
			    String p2 = "Jill";
			    String p3 = "Bob";
			    String p4 = "Betty";
			    String p5 = "Herb";
			    //WRITE YOUR CODE BELOW THIS LINE:
			    // Bob, Jill, Betty, Herb, James
			    
			    System.out.println(p3 + ", " + p2 + ", " + p4 + ", " + p5 + ", " + p1);
			    
			    Scanner scan2 = new Scanner(System.in);
			    String lan1 = scan2.nextLine();
			    String lan2 = scan2.nextLine();
			    
			    //WRITE YOUR CODE BELOW THIS LINE:
			    System.out.println("I will learn " + "\"" + lan1 + "\"" + " and " + "\"" + lan2 + "\"" + " at CybertekSchool.");    
			      
			    //1. WRITE YOUR CODE HERE:
			    int hour, minute, second;
			    String amOrPm;
			    
			    //DO NOT TOUCH BELOW LINES. TEACHER WILL SET VALUES 
			    
			    Scanner sc = new Scanner(System.in);
			    hour  = sc.nextInt();
			    minute = sc.nextInt();
			    second = sc.nextInt();
			    amOrPm = sc.next();
			    //#############################
			  
			     //2. WRITE YOUR CODE HERE:
			     
			     System.out.println(hour + ":" + minute + ":" + second + " " + amOrPm);
			    
			  }
	  }