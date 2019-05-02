package stringManipulation;

public class AccountNumber {
public static void main(String[] args) {
	String accountMessage = "Your account number: 54515ACCD";
	String accountNumD = accountMessage.substring(21);
	
	char firstNum = accountNumD.charAt(0);
	String accountNum;
	
	if (firstNum == '2') {
		accountNum = accountNumD.substring(0, 6);
		System.out.println(accountNum);
	}
	else if (firstNum == '5') {
		accountNum = accountNumD.substring(0, 5);
		System.out.println(accountNum);
	}
	else {
		System.out.println("Account number is not valid");
	}
}
}
