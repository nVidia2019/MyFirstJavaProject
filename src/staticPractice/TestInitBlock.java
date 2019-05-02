package staticPractice;

public class TestInitBlock {
public static void main(String[] args) {

	ClassWithInitBlock.staticMethod();
	
	ClassWithInitBlock one = new ClassWithInitBlock();
	ClassWithInitBlock two = new ClassWithInitBlock();
	ClassWithInitBlock three = new ClassWithInitBlock();
}
}
