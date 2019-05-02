package returnMethod;

public class AccumulatorMethods {
public static void main(String[] args) {
	String str = getStars(10);
	System.out.println(str);
	
	int[] nums = {1, 2, 4, 8, 9, 7, 6, 2, 5, 6};
	for (int num : nums) {
		System.out.println( getStars(num));
	}
}


public static String getStars(int n) {
	String str = "";
	for (int i = n; i > 0; i--) {
		str = "*" + str;
		}
	return str;
}
}
