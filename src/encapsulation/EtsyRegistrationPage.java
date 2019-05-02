package encapsulation;

public class EtsyRegistrationPage {
public static void main(String[] args) {
	EtsyAccount account1 = new EtsyAccount();
	account1.seteMail("john.smith@yahoo.com");
	account1.setFirstName("John");
	account1.setPassword("123");
	System.out.println("Account1 Email: " + account1.geteMail());
	System.out.println("Account1 first name: " + account1.getFirstName());
	System.out.println("Account1 password: " + account1.getPassword());
	
	EtsyAccount account2 = new EtsyAccount();
	account2.seteMail("bob.miller@yahoo.com");
	account2.setFirstName("Bob");
	account2.setPassword("456789");
	System.out.println("Account2 Email: " + account2.geteMail());
	System.out.println("Account2 first name: " + account2.getFirstName());
	System.out.println("Account2 password: " + account2.getPassword());

	EtsyAccount myAccount = new EtsyAccount();
	myAccount.setAccountInfo("abc@yahoo.com", "Peter", "098765");
	System.out.println(myAccount.geteMail() + " | " + myAccount.getFirstName() + " | " + myAccount.getPassword());
	myAccount.seteMail("qwerty@yahoo.com");
	System.out.println(myAccount.geteMail());
	myAccount.seteMail(myAccount.geteMail().replaceFirst("yahoo", "gmail"));
	System.out.println(myAccount.geteMail());
	System.out.println("myAccount info: " + myAccount.getAccountInfo());
	
	EtsyAccount yourAccount = new EtsyAccount();
	yourAccount.setAccountInfo("pppp@gmail.com", "Robin", "qwerty12345");
	String accountInfo = yourAccount.getAccountInfo();
	System.out.println(accountInfo);
}
}
