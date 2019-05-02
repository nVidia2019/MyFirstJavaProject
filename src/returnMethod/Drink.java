package returnMethod;

public class Drink {
public static void main(String[] args) {
	boolean available = false;
	boolean gift = false;
	int ingr1 = 3;
	int ingr2 = 1;
	int ingr3 = 2;
	System.out.println(getThunderBlazz(available, gift, ingr1, ingr2, ingr3));
	
} 
public static boolean getThunderBlazz (boolean available, boolean gift, int ingr1, int ingr2, int ingr3) {
		if (available || gift || (ingr1 == 1 && ingr2 == 2 && ingr3 == 3) || (ingr1 == 3 && ingr2 == 1 && ingr3 == 2)) {
		   return true;
	}
		return false;
}
}
