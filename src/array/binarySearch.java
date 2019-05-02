package array;

import java.util.Arrays;

public class binarySearch {
public static void main(String[] args) {
	String[] words = {"cake", "tomato", "wooden", "spoon", "pizza"};
	Arrays.sort(words); // first you need to sort your array
	System.out.println(Arrays.toString(words));
	System.out.println(Arrays.binarySearch(words, "pizza")); // only after sorting binarySearch will return true index
	// it will be index after the sorting, not index in the initial array.
	
}
}
