package methods;

import java.util.Arrays;

public class PersonFile {
public static void main(String[] args) {
	String str = "John,Smith,15";
	person(str);
}

public static void person(String str) {
	String[] splitStr = str.split(",");
	System.out.println("Name: " + splitStr[0] + ", " + "last name: " + splitStr[1] + ", " + "age: " + splitStr[2]);
}
}
