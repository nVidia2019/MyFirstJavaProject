package encapsulation;

public class CalcTest {
public static void main(String[] args) {
	Calc c = new Calc();
	
	c.plus(10);
	System.out.println(c.getResult());
	
	c.plus(5).plus(2).plus(8).minus(3);
}
}
