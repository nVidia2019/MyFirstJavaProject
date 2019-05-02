package whileLoop;

public class Practice4 {
public static void main(String[] args) throws InterruptedException {
	int number = 1;
	
	while (number <= 20) {
		System.out.print(number + " ");
		number ++;
		Thread.sleep(1000); // <==== 1000 - milliseconds (1 second)
	}
	System.out.println();
	System.out.println("Number value: " + number);
}
}
