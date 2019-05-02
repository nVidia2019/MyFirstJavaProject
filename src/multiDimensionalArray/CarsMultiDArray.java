package multiDimensionalArray;

public class CarsMultiDArray {
public  static void main(String[] args) {
	String [][] cars = {
						{"Honda", "Lexus", "Toyota", "Mazda"},
						{"Audi", "BMW", "Mercedez"},
						{"Dodge", "Ford", "Tesla", "Jeep"},
						{"Ferrari", "Fiat", "Maserati", "Lamborgini"}
					   };
	for (int i = 0; i < cars.length; i++) { // <== outer loop loops arrays
		switch(i) {
		case 0: 
			System.out.print("Japanese: ");
			break;
		case 1: 
			System.out.print("German: ");
			break;
		case 2: 
			System.out.print("American: ");
			break;
		case 3: 
			System.out.print("Italian: ");
			break;
		default:
			System.out.print("Unknown Group of cars.");
		}
		for (int j = 0; j < cars[i].length; j++) { // <== inner loop loops values inside an array
			System.out.print(cars[i][j] + " ");
		}
		System.out.println();
	}
	System.out.println();
	for (String[] carGroup: cars) {   //<=== printing out 2D array:
		for (String car: carGroup) {
			System.out.print(car + " ");
		}
		System.out.println();
	}
}
}
