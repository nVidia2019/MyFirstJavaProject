package classVSobject;

import returnMethod.Email;

public class NewEmployee {
	public static void main(String[] args) {
		Employee person1 = new Employee();
		person1.firstName = "John";
		person1.lastName = "Smith";
		person1.jobTitle = "scrum master";
		person1.eMail = person1.firstName + "." + person1.lastName + "@yahoo.com";
		person1.monthlySalary = 12000;
		System.out.println(person1.eMail);
		person1.hireTo();
	}
	
}
