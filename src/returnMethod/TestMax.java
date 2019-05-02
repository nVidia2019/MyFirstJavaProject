package returnMethod;

public class TestMax {
public static void main(String[] args) {
	int x = 11;
	int max = 5;
	System.out.println("Your max is: " + testMax(x, max));
}
public static int testMax (int x, int max) {
	int result;
	if (x > max) {
		result = max;
	}else {
		result = x;
	}
	return result;
}
}
