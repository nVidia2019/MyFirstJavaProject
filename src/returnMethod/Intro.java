package returnMethod;

public class Intro {
public static void main(String[] args) {
	int amount = giveme5$();
	System.out.println(amount);
	
	String name = whatIsYourName();
	System.out.println("My name is " + whatIsYourName());
	
}

public static int giveme5$(){  
		 int d = 5;
		 return d;
		 }

		 public static String whatIsYourName(){
		 String name = "Bob";
		 return name;
		 }
}
