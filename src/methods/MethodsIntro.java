package methods;

public class MethodsIntro {
	
	public static void main(String[] args) {
		sayHello("John"); //<== Java will run all the code behind this method, every time you call it by name inside the main method.
		sayHello("Jane");
	}
	
	public static void sayHello(String name) { //<=== variable declaration
	System.out.println("Hello " + name);
}
}
