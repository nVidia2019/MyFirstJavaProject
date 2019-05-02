package arrayList;

import java.util.ArrayList;

public class ArrayListWarmUp {
public static void main(String[] args) {
	ArrayList<String> cities = new ArrayList<>(); 
	cities.add("Chicago");
	cities.add("Lviv");
	cities.add("Ivano-Frankivsk");
	cities.add("Lutsk");
	cities.add("Kyiv");
	cities.add("Washington");
	cities.add("New York");
	cities.add("Budapest");
	int count = 0;
	for (int i = 0; i< cities.size(); i++) {
		cities.get(i);
		count++;
	}
	System.out.println("The number of cities you entered is: " + count);
	String longCityName = "";
	for (int i = 0; i< cities.size(); i++) {
		if (cities.get(i).length() >= 7)
		longCityName += cities.get(i) + ", ";
	}
	System.out.println("The cities with 7 and more characters are: " + longCityName);
	
	ArrayList<String> longNames = new ArrayList<>();
	for (String city : cities){
		if (city.length() >= 7) {
			longNames.add(city);
		}
	}
	System.out.println(longNames);
	
	longNames.clear();
	
	System.out.println(longNames.isEmpty() + " " + (longNames.size() == 0));
}
}
