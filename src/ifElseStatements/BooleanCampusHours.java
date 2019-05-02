package ifElseStatements;

import java.util.Scanner;

public class BooleanCampusHours {
public static void main(String[] args) {
	Scanner input = new Scanner (System.in);
	boolean campusOpen;
	System.out.println("Please enter time between 0 to 23:");
	int timeEntered = input.nextInt();

	if (timeEntered >= 0 & timeEntered < 24) {
		if (timeEntered >=8 && timeEntered < 24) {
			campusOpen = true;
		}
		else {
			campusOpen = false;
		}
		System.out.println("Campus open: " + campusOpen);
			}
	else {
		System.out.println("Invalid time. Try again");
	}
}
}