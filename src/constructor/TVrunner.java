package constructor;

public class TVrunner {
public static void main(String[] args) {
	TV myTV = new TV();
	TV smartTV = new TV("Sharp"); 
	
	System.out.println(myTV.isOn());
	myTV.turnOn();
	System.out.println(myTV.isOn());
	myTV.setChannel(20);
	System.out.println("My TV channel: " + myTV.getChannel());

	smartTV.setChannel(5);
	System.out.println("Smart TV channel: " + smartTV.getChannel());
	smartTV.turnOn();
	smartTV.setChannel(5);
	System.out.println("Smart TV channel: " + smartTV.getChannel());
	
	smartTV.channelUp();
	System.out.println("Smart TV channel: " + smartTV.getChannel());
	smartTV.muteTV();
	System.out.println("Smart TV channel: " + smartTV.getVolumeLevel());
	System.out.println("Smart TV brand: " + smartTV.getBrand());
}
}
