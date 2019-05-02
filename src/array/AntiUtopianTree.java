package array;

public class AntiUtopianTree {
public static void main(String[] args) {
	int[] growth = new int[] {-1, 0, 1, 2, 1, 0, 2, 0, 2, 1};
	int treeSize = 0;	
	for (int i = 1; i < growth.length; i++) {
		if (i <= 3) {
			growth[i] = 1;
			treeSize += growth[i];
			System.out.println("Year " + (i) + ": growth " + growth[i] + " cm");
			System.out.println("Tree size: " + treeSize + "cm");
		}else {
			growth[i] = 2;
			treeSize += growth[i];
			System.out.println("Year " + (i) + ": growth " + growth[i] + " cm");
			System.out.println("Tree size: " + treeSize + "cm");
		}
	}
	
}
}
