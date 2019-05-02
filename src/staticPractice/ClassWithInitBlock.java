package staticPractice;

public class ClassWithInitBlock {
	{
		System.out.println("This is initializer block. I run automatically everytime object is created. I run before constructor.");
	}
	
	public ClassWithInitBlock() {
	System.out.println("This is constructor. I run every time the object is created.");
	}
	
	public static void staticMethod() {
		System.out.println("Static method.");
	}
	
	static {
		System.out.println("This is static block. I run only one time before init or construcotr. But ONCE only.");
	}
	
}
