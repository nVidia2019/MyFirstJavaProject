package variables;

import java.util.Scanner;

public class SecondsCalculator {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("\tWelcome to time calculator!!!\n");
		System.out.println("Please enter total seconds: ");
		int seconds = input.nextInt();
		int minutes = seconds/60;
		int remainingSeconds = seconds % 60;
		int hours = minutes/60;
		int remainingMinutes = minutes % 60;
		System.out.println(seconds + " " + "seconds converted into: " + hours + " hours" + "," + " " + remainingMinutes + " " + "minutes and "+ remainingSeconds + " " + "seconds.");
		System.out.println();
		System.out.println("Please enter total days:");
		int days = input.nextInt();
		int newHours = days * 60;
		int newMinutes = newHours * 60;
		int newSeconds = days * 24 * 60 * 60;
		System.out.println(days + " " + "days converted into: " + newHours + " hours, " + "or " + newMinutes + " minutes, or " + newSeconds + " " + "seconds");
	input.close();
	}
}
