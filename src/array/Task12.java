package array;

import java.util.Arrays;

public class Task12 {
public static void main(String[] args) {
	String[] oldArr = new String[] {"one", "two", "three"};
	String newWord = "four";
	String[] newArr = new String [oldArr.length+1];
	
	for (int i = 0; i < oldArr.length; i++) {
		newArr[i] = oldArr[i];
	}
	newArr[newArr.length - 1] = newWord;
	System.out.print(Arrays.toString(newArr));
}
}
