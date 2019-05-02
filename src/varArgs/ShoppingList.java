package varArgs;

public class ShoppingList {
public static void main(String[] args) {
	shoppingList("bread", "milk", "eggs", "butter", "cereal");
//	int n = 9;
//	String str = n + "";
//	System.out.println(str);
	
}

public static void shoppingList (String ... items) {
	System.out.println("Shopping list: ");
	for (String item : items) {
		System.out.print(item + " ");
	}
}	
	public static void shoppingList (String[]... items) {
		System.out.println("Shopping list: ");
		for (String[] item : items) {
			System.out.print(item + " ");
		} 
	}
}
