package array;

import java.util.Arrays;
import java.util.Scanner;

public class FindS_S {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Enter a String: ");
	String str = input.nextLine();
	
	char[] arr = str.toCharArray();
	boolean s_s = false;
	for (int i = 0; i < arr.length-2; i++) {
		if (arr[i] == 's' && arr[i+2] == 's') {
			s_s = true;
			
		} else {
			s_s = false;
		}
		}
	System.out.println(s_s); 
	
}
}
