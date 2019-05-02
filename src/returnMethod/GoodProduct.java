package returnMethod;

public class GoodProduct {
public static void main(String[] args) {
	int[] products = {1, 1, 0, 0};
	int damaged = 2;
	System.out.println("Product is good: " + goodProduct(products, damaged));
	
}
public static boolean goodProduct (int[] products, int damaged) {
	int count = 0;
	for (int product : products) {
		if (product == 0) {
			count++;
		}
	}
	if (count < damaged)
		return true;
	return false;
}
}
