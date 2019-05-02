package classVSobject;

public class CellPhone {
	//properties/data/information	
	String brand;
	String color;
	double price;
	
	//behavior/methods
	
	public void call() {
		System.out.println("Calling...");
	}
	
	public void text() {
		System.out.println("Sending a txt message...");
	}
	
	public void watchVideo () {
		System.out.println("Watching a video...");
	}
	
	public void showBrand () {
		System.out.println("Your phone brand is: " + brand);
	}	

	
}
