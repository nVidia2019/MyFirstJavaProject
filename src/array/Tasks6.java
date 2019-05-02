package array;

public class Tasks6 {
public static void main(String[] args) {
	int [] a = new int[] {4, 5, 6};
	
	int [] b = new int[a.length + 1];
	System.out.print(b.length);
	System.out.println();
	
	String [] s_r = new String[] {"foo", "hello", "bar", "world"};
	for(String str : s_r) {
		if(str.equalsIgnoreCase("foo")) {
			System.out.print(str);
			System.out.println();
		}else if (str.equalsIgnoreCase("bar")) {
			System.out.print(str);
	}
	}
}
}
