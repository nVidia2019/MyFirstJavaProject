package array;

public class PrintCircle {
public static void main(String[] args) {
	String [][] arr = new String [][]{{"a", "b", "c", "d", "e"},
									  {"h", "i", "j", "k", "l"},
									  {"p", "q", "r", "s", "t"},
									  {"w", "x", "y", "z", "0"},
									  {"3", "4", "5", "6", "7"},
									  {"10", "11", "12", "13"},
									  {"16", "17", "18", "19"}};
 //System.out.println(arr[(arr.length)/2][(arr[(arr.length)/2].length)/2]); //<=== central character
 
 for (int i = arr[arr.length/2].length/2 - 1; i <= arr[arr.length/2].length/2 + 1; i++) { 
	 //System.out.println(i);
	 System.out.print(arr[(arr.length/2)-1][i]);
 }
 
 System.out.print(arr[(arr.length)/2][(arr[(arr.length)/2].length)/2+1]);
 
 for (int i = arr[arr.length/2].length/2 + 1; i >= arr[arr.length/2].length/2 - 1; i--) {
	 System.out.print(arr[(arr.length/2)+1][i]);
 }
 
 System.out.print(arr[(arr.length)/2][(arr[(arr.length)/2].length)/2-1]);
}
}
