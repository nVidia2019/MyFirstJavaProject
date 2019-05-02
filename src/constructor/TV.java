package constructor;

public class TV {
	private int channel = 1;
	private int volumeLevel = 1;
	private boolean on = false;
	private String brand = "undefined";
	
	public TV() {
		System.out.println("Creating a TV object from using no args constructor.");
	}
	
	public TV(String brand) {
		System.out.println("Creating a TV object using 1 arg constructor.");
		this.brand = brand;
	}
	
	
	
	public int getChannel() {
		return channel;
	}
	public void setChannel(int channel) {
		if (on && (channel > 0 && channel <121)) { 
		this.channel = channel;
		}else {
			System.out.println("Error: TV is either OFF or invalid channel.");
		}
	}
	
	
	public int getVolumeLevel() {
		return volumeLevel;
	}
	public void setVolumeLevel(int volumeLevel) {
		if (on && (volumeLevel > 0 && volumeLevel <8)) {
		this.volumeLevel = volumeLevel;
		}else {
			System.out.println("Error: TV is either OFF or invalid volume level.");
		}
	}
	
	public boolean isOn() {
		return on;
	}
	public void turnOn() {   // two setters for on variable;
		if (isOn()) {
			System.out.println("TV is already ON.");
		}else {
			on = true;
		}
	}
	
	public void turnOff() {  // two setters for on variable;
		if (on == false) {
			System.out.println("TV is already OFF.");
		}else {
			on = false;
		}
	}
	
	public void channelUp() {
		if (isOn() && channel < 120) {
			channel++;
		}else {
			System.out.println("Error: TV is either off or you are on the last channel.");
		}
	}
	
	public void channelDown() {
		if (isOn() && channel > 1) {
			channel--;
		}else {
			System.out.println("Error: TV is either off or you are on the first channel.");
		}
	}
	
	public void volumeUp() {
		if (isOn() && volumeLevel < 7) {
			volumeLevel++;
		}else {
			System.out.println("Error: TV is either off or you are on maximum volume.");
		}
	}
	
	public void volumeDown() {
		if (isOn() && volumeLevel > 1) {
			volumeLevel--;
		}else {
			System.out.println("Error: TV is either off or it is muted.");
		}
	}
	
	public void muteTV() {
		if (isOn() && volumeLevel > 0) {
			volumeLevel = 0;
		}else {
			System.out.println("Error: TV is either off or it is already muted.");
		}
	}
	
	public String getBrand() {
		return brand;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
}
