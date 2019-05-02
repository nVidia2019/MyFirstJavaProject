package array;

import java.util.Arrays;

public class copyOfResizeArray {
public static void main(String[] args) {
	int [] a = {10, 20, 30};
	int [] b = Arrays.copyOf(a, 2); // <--- only 2 values are copied into the new array
	
	System.out.print(Arrays.toString(b));
	System.out.println();
	// if you want to resize array: copy it and put the required index
	
	a = Arrays.copyOf(a, 5); // <=== now your a will have not 3, but 5 variables, 2 of them will have 0 inside, but you can assign new values to them
	System.out.print(Arrays.toString(a));
}
}
