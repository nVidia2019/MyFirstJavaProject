package methods;

import java.util.Scanner;

public class Study {
public static void main(String[] args) {
	System.out.println("Enter a day of week and a topic:");
	Scanner input = new Scanner (System.in);
	String day = input.nextLine();
	String topic = input.nextLine();
	study(day, topic);
}

public static void study(String day, String topic) {
	System.out.println("Today is " + day + " and we are studying " + topic + ". ");
}
}
