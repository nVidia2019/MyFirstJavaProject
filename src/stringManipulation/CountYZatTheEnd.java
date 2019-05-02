package stringManipulation;

import java.util.Arrays;

public class CountYZatTheEnd {
	public static void main(String[] args) {
	
String str = "day men buzz cley";
str = str.toLowerCase();
String [] arr = str.split(" ");
System.out.print(Arrays.toString(arr));
System.out.println();
int count = 0;

for (String strsplit: arr) {
	if (strsplit.endsWith("y") || strsplit.endsWith("z"))
		count +=1;
}
System.out.println(count);
}
}
