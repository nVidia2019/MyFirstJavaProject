package ifElseStatements;

import java.util.Random;
import java.util.Scanner;

public class BooleanPractice {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Enter your message to send:");
	String message = input.nextLine();
	int messageLength = message.length();
	boolean sent;
	boolean delivered;
	
	Random random = new Random ();
	int randomNumber = random.nextInt(11);
	
	if (messageLength >= 15) {
		sent = true;
	}
	else {
		sent = false;
	}
	
	if (randomNumber % 2 == 0) {
		delivered = true;
	}
	else {
		delivered = false;
		
	if (!sent) {
		delivered = false;
	}
		
	}
	System.out.println("Message: " + message);
	System.out.println("Sent: " + sent);
	System.out.println("Delivered: " + delivered);
}
}
