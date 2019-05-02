package operators;

public class AndOperator {
public static void main(String[] args) {
	int age = 45;
	String name = "James";
	System.out.println(age > 21);
	System.out.println(name == "James"); // it compares if it's true for both: age and name
	// the other way to put it is ==> 
	boolean result = (age > 21) && (name == "James"); // this can be true only if both statements are true, if one is failing, the result will be false
	System.out.println("Final result: " + result);
	
	boolean result2 = (age > 21) || (name == "Tom"); // the result is still true, as age is true, though name is false
	System.out.println("Final result: " + result);
	boolean result3 = (age > 21) && (name == "Tom"); // the result is false, though age is true, the name is false
	System.out.println("Final result: " + result);
}

}

