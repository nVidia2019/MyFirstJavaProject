package multiDimensionalArray;

public class TwoMatchesNotNeighbouring {
	public static void main(String[] args) {
		
	String[][] arr = { {"2", "8", "0", "2"}, 
			   {"6", "9", "6", "8"}, 
			   {"9", "8", "11", "10"} };
	int count = 0;
	for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length - 1; j++) {
				for (int k = 1; k < arr[i].length - 1; k++) {
					if (arr[i][j] == arr[i][k]) {
						count++; 
					}
				}
								
			}

	}
	System.out.println(count);
}
}