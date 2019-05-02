package stringManipulation;

public class Task1 {
public static void main(String[] args) {
	String str = "Sender:<Mike Smith>. From Number:[202-123-3456]. Message:{I love programing and problem solving}";
	int firstChar = str.indexOf("<")+1;
	int secondChar = str.indexOf(">");
	String sender = str.substring(firstChar, secondChar);
	System.out.println(sender);
	int thirdChar = str.indexOf("[")+1;
	int forthChar = str.indexOf("]");
	String phoneNumber = str.substring(thirdChar, forthChar);
	System.out.println(phoneNumber);
	int fifthChar = str.indexOf("{")+1;
	int sixthChar = str.indexOf("}");
	String message = str.substring(fifthChar, sixthChar);
	System.out.println(message);
	}
}
