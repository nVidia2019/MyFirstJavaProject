package doWhileLoop;

public class Task7 {
	public static void main(String[] args) {
			
	int num = 0;
	int sum = 0;
	
	do {
	if (num % 2 == 0) {
		System.out.print(num + "= ");
		sum = sum + num;				
		System.out.println(sum + "+ ");
		}
	num ++;
	} while (sum < 110); 
}
}
