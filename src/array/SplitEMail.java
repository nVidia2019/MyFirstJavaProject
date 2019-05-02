package array;

public class SplitEMail {
public static void main(String[] args) {
	String str = "info@cybetekcom"; // print in separate lines Email ID and Email Domain; if no @ or more than 1 - print "Invalid Email"
	String[] splitEmail = str.split("@");
	
	if (splitEmail.length == 2) {
		System.out.println("Email ID: " + splitEmail[0]);
		System.out.println("Email Domain: " + splitEmail[1]);
	}else {
		System.out.println("Invalid Email");
	}
	
}
}
