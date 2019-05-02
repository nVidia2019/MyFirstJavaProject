package array;

public class kitchenItems {
public static void main(String[] args) {
	String[] kitchenItems = {"Knife ", " cutting board ", "Spice", "frying pan", "plate"
		};
	
	for(String item: kitchenItems) {
		switch(item.toLowerCase().trim()) {
		case "knife":
			System.out.println("Knife is used for cutting");
			break;
		case "cutting board":
			System.out.println("Cutting board is used to cut on it");
			break;
		case "spice":
			System.out.println("Spice is used to add flavour and taste");
			break;
		case "frying pan":
			System.out.println("Frying pan is used to fry food in it");
			break;
		default:
			System.out.println("Plate is used to serve the food");
		}
	}
}
}
