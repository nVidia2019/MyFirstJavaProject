package staticPractice;

public class ClassWithStaticBlock {
		static {
	System.out.println("This is static Block. I run only once at the beginning.");
		}
		public ClassWithStaticBlock() {
	System.out.println("This is a Constructor. I run every time an object is created.");
		}
		
		public static void staticMethod() {
			System.out.println("This is static method.");
		}


}
