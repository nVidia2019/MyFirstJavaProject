package whileLoop;

public class Task6 {
	public static void main(String[] args) {
		int num = 0;
		int sum = 0;
		
		while (num <= 20) {
			if (num % 2 == 0) {
				System.out.print(num + "= ");
				sum = sum + num;				
				System.out.println(sum + "+ ");
			}
		num ++;
		}
}
}