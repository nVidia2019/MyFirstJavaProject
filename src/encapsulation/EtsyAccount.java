package encapsulation;

public class EtsyAccount {
	private String eMail;
	private String firstName;
	private String password;
	
	public String geteMail() {
		return eMail;
	}
	public void seteMail(String eMail) {
		this.eMail = eMail;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		if (password.length() < 6) {
			System.out.println("Password must be at least 6 characters");
			return;
		}
		this.password = password;
	}
	
	public void setAccountInfo(String eMail, String firstName, String password) {
		this.eMail = eMail;		
		this.firstName = firstName;
		//this.password = password;  <=== is also possible, but you will need to write the if-condition again, we already have it in our setter
		setPassword(password);
	}
	
//	public String getAcountInfo() {
//		return eMail;   <=== this code will not compile as there can be no code after RETURN line;
//		return firstName;
//		return password;
//	}
	
	public String getAccountInfo() {
		String accountInfo = eMail + " | " + firstName + " | " + password;
		return accountInfo;
	//  return eMail + " | " + firstName + " | " + password;  <=== also possible
	//	return get.eMail + " | " + get.firstName + " | " + get.password;
	
	}
	
	
	
	
	
	
	
}
