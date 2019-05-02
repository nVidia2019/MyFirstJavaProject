package returnMethod;

public class OverloadingIntro {
public static void main(String[] args) {
	
}

public static int add (int int1, int int2) {   // <=== these two methods are overloaded: different number and types of params
	return int1+int2; 
}
public static double add (double d1, double d2, double d3) {
	return d1+d2+d3;
}
///////////////////////////////////////////////////////////////////////
public static boolean playGame (String game, int players) {  // <=== there two methods are also overloaded: order of params is different
	System.out.println("Playing <" + game + "> with <" + players + "> players.");
	return players >=2; 
}
public static boolean playGame (int players, String game) {
	System.out.println("Playing <" + game + "> with <" + players + "> players.");
	return players >=2; 
}
////////////////////////////////////////////////////////////////////////
public static boolean work (String jobType) { // <=== these two methods are overloaded: different types of params
	return jobType.equalsIgnoreCase("sdet") || jobType.equalsIgnoreCase("developer");
}
	
public static double work (int hours) {
	int salary = hours * 60;
	System.out.println("Worked <" + hours + "> and made <$" + salary + "> income.");
	return salary;
	}
}
/////////////////////////////////////////////////////////////////////////

