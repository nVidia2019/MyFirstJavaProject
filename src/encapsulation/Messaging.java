package encapsulation;

public class Messaging {
public static void main(String[] args) {
	Message msg1 = new Message("Hello!", "John", "myself");
	Message msg2 = new Message("Java is fun!");
	Message msg3 = new Message("How are you?", "David");
	Message msg4 = new Message();
	
	System.out.println(msg1.toString());
	System.out.println(msg2.toString());
	System.out.println(msg3.toString());
	System.out.println(msg4);
}
}
