package variables;

import java.util.Scanner;

public class HomeAssignment {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter username:");
		String username = input.nextLine();
		System.out.println("Please enter password:");
		String password = input.nextLine();
		System.out.println();
		System.out.println("\tWelcome, " + username);
		System.out.println("Profile\t" + "\tPictures" + "\tVideos");
		System.out.println("Posts\t" + "\tLikes\t" + "\tComments");
		System.out.println("Products\t" + "Orders\t" + "\tFeedbacks");
		System.out.println();
		System.out.println("Profile edit Page:");
		System.out.println("First name:");
		String firstName = input.nextLine();
		System.out.println("Last name:");
		String lastName = input.nextLine();
		System.out.println("Address:");
		String address = input.nextLine();
		System.out.println("Credit Card Number:");
		long ccNumber = input.nextLong();
		System.out.println();
		System.out.println("Information you entered:");
		System.out.println("Name: " + firstName + " " + lastName);
		System.out.println("Address: " + address);
		System.out.println("CC Number: " + ccNumber);
		System.out.println();
		boolean save;
		System.out.println("Save now?");
		System.out.println("Yes");
	    System.out.println("No\n");
	    save = input.hasNext();
	    System.out.println();
	    System.out.println("Thank you");
	}
}

