package array;

public class Task2 {
public static void main(String[] args) {
	String []cars = new String[11];
	cars[0] = "Moskvich";
	cars[1] = "Audi";
	cars[2] = "Porsche";
	cars[3] = "BMW";
	cars[4] = "Toyota";
	cars[5] = "Honda";
	cars[6] = "Tesla";
	cars[7] = "Dodge";
	cars[8] = "Kia";
	cars[9] = "Acura";
	cars[10] = "Fiat";
			System.out.println(cars.length);
			for (int i = 0; i < cars.length; i++) { 
			System.out.print(cars[i]+ ", ");
			}
		
}
}
