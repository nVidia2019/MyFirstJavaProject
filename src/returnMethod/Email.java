package returnMethod;

public class Email {
public static void main(String[] args) {
	String firstName = getFirstName();
	String lastName = getLastName();
	System.out.println("Email is: " + getFirstName() + "_" + getLastName() + "@gmail.com");

}

 
public static String getFirstName() {
	String firstName = "John";
	return firstName;
}

public static String getLastName() {
	String lastName = "Smith";
	return lastName;
}
}
