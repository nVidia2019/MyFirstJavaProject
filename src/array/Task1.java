package array;

public class Task1 {
public static void main(String[] args) {
	String[] names = new String[5];
	names[0] = "John"; 
	names[1] = "James";
	names[2] = "Bob"; 
	names[3] = "Tim";
	names[4] = "Matt";
	System.out.println(names.length);// count of values on array
	String name = names[1];
	System.out.println( name.length() );
}
}
