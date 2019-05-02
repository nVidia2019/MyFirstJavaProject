package constructor;

public class Car {
	private String type;
	private String make;
	private String model;
	private int speed;
	
	public Car() {   // <=== no argument constructor;
		System.out.println("Car class constructor.");
		type = "unknown"; //<=== without this constructor, values of these Strings would have been "null";
		make = "unknown";
		model = "unknown";
		speed = 0;
	}
	
	public Car (String type, String make, String model, int speed) {
		System.out.println("3 args constructor running:");
		this.type = type;
		this.make = make;
		this.model = model;
		this.speed = speed;
	}
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	public void accellerate(int mph) {
		speed += mph;
		System.out.println(make + " " + model + " " + type + " " + "is accellerating.");
	}
	
	public String getCarInfo() {
		return make + " " + model + " " + type + ", " + "current speed: " + speed + " mph.";
	}
}
