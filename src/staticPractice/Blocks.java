package staticPractice;

public class Blocks {
	static int num = 100;
	static String str;
		
	static {             // <=== Static block, runs before anything but ONCE
		System.out.println("static block"); // runs 1st
		num = num + 1000;
		str = "Hello";
	}
	{
		System.out.println("init block");  // init block, runs before constructor, here runs 2nd, runs 4th
		num += 500;
		str += " world";
		
	}
	
	public Blocks() {
		System.out.println("constructor"); // here runs after everything else, runs 3rd, runs 5th
		num *= 2;
		str += "!!!";
	}
}
