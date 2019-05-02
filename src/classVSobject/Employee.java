package classVSobject;

public class Employee {
	String firstName;
	String lastName;
	String eMail;
	String jobTitle;
	int monthlySalary;
	
	
	public void hireTo() {
		System.out.println("Employee " + lastName + " is hired as " + jobTitle + " with monthly salary $" + monthlySalary);
	}

}
