package array;

import java.util.Arrays;

public class CopyArray {
public static void main(String[] args) {
	int [] a = {10, 20, 30};
	int [] b = Arrays.copyOf(a, 3);
	System.out.println(Arrays.toString(b));
}
}
