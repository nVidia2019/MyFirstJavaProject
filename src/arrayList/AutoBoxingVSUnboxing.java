package arrayList;

import java.util.*;

public class AutoBoxingVSUnboxing {
public static void main(String[] args) {
	int n = 100;
	Integer j = n; // <=== AutoBoxing example
	
	Double d = 34.2;  // <=== Autoboxing
	
	boolean b = true;
	Boolean b2 = b;
	
	List<Integer> nums = new ArrayList<>();
	nums.add(433);
	int p = 555;
	nums.add(p);  // <=== Autoboxing: primitive is turned into Wrapper Class Object
	nums.add(new Integer (77)); // <=== no Autoboxing needed: we assign wrapper class Object
	
	int r = nums.get(0); // <==== Un-boxing: takes wrapper class object and puts the primitive into new int r;
	Boolean bool = new Boolean(false);
	boolean boolPrim = bool;
	System.out.println(boolPrim); // Un-boxing
	
	Character chObj = '^'; // <=== Auto-boxing
	char chPrim = chObj; // <=== Un-boxing
	
}
}
