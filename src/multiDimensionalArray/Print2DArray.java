package multiDimensionalArray;

public class Print2DArray {
	public static void main(String[] args) {
		String[][] arr = { {"2", "2", "0", "4"}, 
				   {"6", "6", "7", "8"}, 
				   {"9", "10", "11", "11"} };	
		
		for (String [] a : arr) {
			for (String b : a) {
				System.out.print (b);
			
			}
			System.out.println();
		}
	}
	
	
	
	
	
}
