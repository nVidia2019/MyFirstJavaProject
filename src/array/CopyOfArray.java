package array;

import java.util.*;

public class CopyOfArray {
	public static void main(String[] args) {
		int [] a = {10, 20, 30};
		int [] b = Arrays.copyOf(a, 30);
		
		System.out.println(Arrays.toString(Arrays.copyOf(a, 50)));	
		System.out.println(Arrays.toString(a));
	}
	
}
