package casting;

public class PrimitiveCasting {
public static void main(String[] args) {
	short s = 45;
	int age = s; //short is smaller than int
	System.out.println(age);
	int size = age;
	byte b = (byte)size;//byte is smaller than int, so you have to do explicit casting/conversion
	
	String str = "0.81";
	double seconds = Double.valueOf(str); // String is converted into double
	System.out.println(seconds + 1);
	//but:
	String s2 = "55.2"; // you can't convert this String to integer immediately
	double d = Double.valueOf(s2);
	int i = (int)d; // explicit casting
	
}
}
