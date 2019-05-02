package array;

public class AddValuesUntilSum {
public static void main(String[] args) {
	double[] d_r = new double[] {0.2, 0.3, 1.0, 1.5, 2.0};//find two int that give 2.5 as a sum, print them
	
	for (int i = 0; i < d_r.length - 1; i++) {
		if (d_r[i] + d_r[i + 1] == 2.5) {
			System.out.print(d_r[i] + " " + d_r[i + 1]);
		}
	}

}
	}
