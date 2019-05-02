package multiDimensionalArray;

public class TwoNeighbouringMatches {
public static void main(String[] args) {
	String[][] arr = { {"2", "2", "0", "4"}, 
			   {"6", "6", "7", "8"}, 
			   {"9", "10", "11", "11"} };
	int count = 0;
	for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length - 1; j++) {
				if (arr[i][j] == arr[i][j+1])
					count++;
			}

	}
	System.out.println(count);
}
}
