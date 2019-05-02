package returnMethod;

public class MethodWithParameters {
public static void main(String[] args) {
	
String newEmail = buildEMail("Mike", "Jackson");
System.out.println(newEmail);
System.out.println(buildEMail("Tom", "Anderson "));

System.out.println(biggerNum(100, 3));
int myNum = biggerNum(30, 31);
System.out.println(myNum);
int max = biggestNum(2, 2, 1 );
System.out.println(max);
}

public static String buildEMail(String firstName, String lastName) {
	String eMail = firstName + "_" + lastName + "@gmail.com";
	return eMail;
}
public static int biggerNum (int int1, int int2) {
	int bigger;

	if (int1 > int2) {
		bigger = int1;
	}else {bigger = int2;
	}
	return bigger;
	}
	
public static int biggestNum(int num1, int num2, int num3) {
	if (num1 >= num2 && num1 >= num3) {
		return num1;
	}else if (num2 >= num1 && num2 >= num3) {
		return num2;
	}else {
		return num3;
	}
}
}
