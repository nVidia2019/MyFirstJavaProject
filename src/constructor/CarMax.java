package constructor;

public class CarMax {
public static void main(String[] args) {
	Car carOne = new Car();
	carOne.setMake("Acura");
	carOne.setModel("ILX");
	carOne.setType("Sedan");
	carOne.setSpeed(35);
	
	carOne.accellerate(30);
	System.out.println(carOne.getCarInfo());
	
	Car carTwo = new Car();  // <===Constructor no arg method is running here;
	System.out.println(carTwo.getCarInfo());
	
	Car carThree = new Car("Coupe", "Ford", "Mustang", 20); // Constructor 4 arg method is running;
	System.out.println(carThree.getCarInfo());
}
}
