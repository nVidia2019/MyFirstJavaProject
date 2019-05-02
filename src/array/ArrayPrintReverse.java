package array;

public class ArrayPrintReverse {
public static void main(String[] args) {
	int[] points = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
		if(points.length == 10) {
			System.out.println("10 points found");
		}else {
			System.out.println("We need ten points");
		}
		
		int ind = points.length - 1;
		
		while(ind >= 0) {   // <=== 1st way
			System.out.print(points[ind--] + " ");
		}
		System.out.println();
		for (int i = points.length - 1; i >= 0; i--) {  // <=== 2nd way
			System.out.print(points[i] + " ");
		}
}
}
