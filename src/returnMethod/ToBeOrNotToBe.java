package returnMethod;

public class ToBeOrNotToBe {
public static void main(String[] args) {
	boolean b1 = false;
	boolean b2 = true;
	boolean final1 = hamletQuote(b1, b2);
	System.out.println(final1);
}

public static boolean hamletQuote (boolean b1, boolean b2) {
	if (b1 == true && b2 == true) {
		return true;
	}
	if (b1 == true && b2 == false) {
		return false;
	}
	if (b1 == false && b2 == true) {
		return false;
	}
	if (b1 == false && b2 == false) {
		return false;
	}
	return false;
}
}
