package operators;

public class Increments {
	public static void main(String[] args) {
		int size = 50;
		System.out.println(size++);
		System.out.println(size);
		
		int age = 45;
		int otherAge = age++; // first old value will be printed and then it will have +1 added. If you put "++age", it will add and then print the new value.
		System.out.println(otherAge);
		System.out.println(age);

		System.out.println(++age);
		int size2 = --age;
		System.out.println(size2);
	}
	
}
