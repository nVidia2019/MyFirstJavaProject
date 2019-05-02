package arrayList;

public class CreatingWrapperClasses {
public static void main(String[] args) {
	Integer n1 = new Integer(100);
	Integer n2 = Integer.valueOf(200);
	Integer n3 = Integer.parseInt("345");
	
	Double d1 = new Double (10.8);
	Double d2 = Double.valueOf(45.026);
	Double d3 = Double.parseDouble("1000.5");
	
	Character ch1 = new Character('A');
	Character ch2 = Character.valueOf('@');
	System.out.println(Character.valueOf('@'));
	
	Character ch3 = '3'; 
	System.out.println(Character.isDigit(ch3));
	String str = "ad3f";
	System.out.println(Character.isAlphabetic(str.charAt(2)));
	System.out.println(Character.isUpperCase('A'));
	System.out.println(Character.isLetterOrDigit('@'));
	}
}
