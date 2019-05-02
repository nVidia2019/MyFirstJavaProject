package array;

public class Task5 {
public static void main(String[] args) {
	String [] arr = {"apples", "banana", "kiwi"};
	
	for (String fruit: arr) {
		System.out.println(fruit.substring(0, 3));
	}
	System.out.println("====> For Loop <====");
	
	for(int ind = 0; ind < arr.length; ind++) {
		System.out.println(arr[ind].substring(0, 3));
	}
}
}
