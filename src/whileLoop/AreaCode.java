package whileLoop;

import java.util.Scanner;

public class AreaCode {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Please enter the phone number:");
	String phnum = input.nextLine();
	String code;
	String state = "";
	boolean par = phnum.startsWith("(");
	if (par){
		code = phnum.substring(1, 4);
	}
	else {
		code = phnum.substring(0, 3);
	}
	switch (code) {
	case ("202"): 
		state = "Washington DC";
		break;
	case ("203"): 
		state = "Virginia";
		break;
	default:
		System.out.println("Invalid area code");
	}
	System.out.println(state);
}
}
