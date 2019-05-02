package array;

public class Task6 {
public static void main(String[] args) {
	int[] arr = {0, 1, 2, 10, 5, 7, 20, 4, 1, 9, 30, 8};
	
	for (int i = 0; i < arr.length - 1; i++) {
		if (arr[i] == 10 && arr[i+1] != 20) {
			if (arr[i] == 20 && arr[i+1] != 30) { 
				arr[i+1] = arr[i];
			}		
			arr[i+1] = arr[i];
		}
		System.out.print(arr[i] + ", ");
	}
	}
}
