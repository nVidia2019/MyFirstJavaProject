package returnMethod;

import java.util.Arrays;

public class MultiplyMatrix2DArray {
	public static void main(String[] args) {
		int[][] matrix = { {1,2,3}, {4,5}, {6,7,8,9} };
		int n = 2;
		System.out.println(Arrays.deepToString(multiN (matrix, n)));
		//System.out.println(matrix.length); 
		//System.out.println(matrix[2].length);
	}
	public static int[][] multiN (int[][] matrix, int num){
		for (int arrIndex = 0; arrIndex < matrix.length; arrIndex++) {
			 for (int varIndex = 0; varIndex < matrix[arrIndex].length; varIndex++) {
				 matrix[arrIndex][varIndex] *= num;
			 }
		}
	return matrix;
}
}
