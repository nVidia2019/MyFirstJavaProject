package stringBuilder;

public class Append {
public static void main(String[] args) {
	StringBuilder listBuilder = new StringBuilder("Wooden spoon");
	listBuilder.append(", Iron Spoon");
	
	
	listBuilder.append('!');
	System.out.println(listBuilder);
	listBuilder.append(125);
	System.out.println(listBuilder);
	
	listBuilder.append(true);
	System.out.println(listBuilder);
	listBuilder.delete(0, 7);
	System.out.println(listBuilder);
	
	listBuilder.reverse();
	System.out.println(listBuilder);
	listBuilder.reverse();
	listBuilder.deleteCharAt(17);
	System.out.println(listBuilder);
	
	StringBuilder listBuilder2 = new StringBuilder("SeleniumAutomation");
	listBuilder2.insert(8, " Test ");
	System.out.println(listBuilder2);
	listBuilder2.replace(0, 8, "Appium");
	System.out.println(listBuilder2);
	StringBuilder builder1 = new StringBuilder ("java");
	StringBuilder builder2 = new StringBuilder ("java");
	System.out.println(builder1.equals(builder2));
	System.out.println(builder1 == builder2);
}

}
