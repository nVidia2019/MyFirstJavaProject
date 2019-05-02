package ifElseStatements;

import java.util.Random;

public class RandomOddEven {
	
	public static void main(String[] args) {
		// Random --> a class that comes from Java library and generates us some random number
		// bound --> boundary, the limit up to which number it will generate (from 0 to which number you put)
		// 0 is included, 10 is not in this case
		Random random = new Random ();
		int i = random.nextInt(101);
		System.out.println(i);
		
		
		if(i % 2 == 0) {
			System. out. println("The given number "+i+" is Even ");
		}
		else {
			System. out. println("The given number "+i+" is Odd ");
		}
	}
	

}
