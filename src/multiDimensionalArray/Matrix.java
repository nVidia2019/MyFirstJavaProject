package multiDimensionalArray;

public class Matrix {
public static void main(String[] args) {
	String[][] arr = { {"1", "2", "3", "4"}, 
					   {"5", "6", "7", "8"}, 
					   {"9", "10", "11", "12"} };
	for (int i = 0; i < arr.length; i++) {
		for (int j = 0; j < arr[i].length; j++) {
			if (j % 2 == 0) {
				arr[i][j] = "0";
			}
			else {
				arr[i][j] = "1";
			}
			System.out.print(arr[i][j] + " ");
		}
		System.out.println();
}
	
}

}