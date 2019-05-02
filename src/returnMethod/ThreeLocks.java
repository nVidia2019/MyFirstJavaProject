package returnMethod;

public class ThreeLocks {
public static void main(String[] args) {
	boolean a = true;
	boolean b = false;
	boolean c = true;
	System.out.println(threeLocks(a, b, c));
}
public static boolean threeLocks (boolean a, boolean b, boolean c) {
	if (a && b == true || c == true) 
		return true;
	else
		return false;
}
}
