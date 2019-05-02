package inheritance;

public class DefaultValues {
	public int intValue;
	public byte byteValue;
	public boolean booleanValue;
	public char charValue;
	public double doubleValue;
	public String stringValue;
	public Integer integerObject;
	
	public static void main(String[] args) {
		DefaultValues d = new DefaultValues();
		System.out.println(d.intValue);
		System.out.println(d.byteValue);
		System.out.println(d.booleanValue);
		System.out.println(d.doubleValue);
		System.out.println(d.charValue);
		System.out.println(d.stringValue);
		System.out.println(d.integerObject);
	}
	
}
