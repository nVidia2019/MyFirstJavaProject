package nestedLoop;

public class NestedLoop {
public static void main(String[] args) {
	
	for (int num2 = 1; num2 <= 0; num2 ++) {// <=== outer loop makes inner loop run 5 times
	
		for(int num = 1; num <= 10; num++) {// <=== inner loop runs 10 times and is repeated 5 times
		System.out.print(num + " ");
		}
	System.out.println();
	}
	System.out.println("Outside the loop");
		
}
}
