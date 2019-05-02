package nestedLoop;

public class NestedLoop2 {
public static void main(String[] args) {
	
	for (int num2 = 10; num2 >= 1; num2 --) {// for each iteration of outer loop
		
		for(int num = 1; num <= num2; num++) { // inner loop runs from the beginning till its end
		System.out.print(num + " ");
		}
		System.out.println();
	}
	System.out.println("Outside the loop");
}
}
