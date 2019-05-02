package encapsulation;

public class HouseTester {
public static void main(String[] args) {
//	House house1 = new House();
//	house1.type = "Castle";
//	house1.address = "123, N Main Ave, Chicago";
//	house1.bedrooms = 15;
//	house1.year = 2018;
//	printHouseInfo(house1);
//	
//	House greenHouse = new House();
//	greenHouse.type = "green";
//	greenHouse.address = "1000, N Great Ave, Chicago";
//	greenHouse.bedrooms = 3;
//	greenHouse.year = 2000;
//	printHouseInfo(greenHouse);
	String type = "townhouse";
	String address = "444 N New Str, Chicago";
	int bedrooms = 5;
	int year = 1999;
	House newHouse = buildAHouse(type, address, bedrooms, year);
	System.out.println(newHouse.type);
	System.out.println(newHouse); //<==== encapsulation message 0  
	printHouseInfo(newHouse);
	
}

public static void printHouseInfo (House houseObj) {
	System.out.println("Type: " + houseObj.type);
	System.out.println("Address: " + houseObj.address);
	System.out.println("Bedrooms #: " + houseObj.bedrooms);
	System.out.println("Year: " + houseObj.year);
	
	}
public static House buildAHouse (String type, String address, int bedrooms, int year) {
	House newHouse = new House();
	newHouse.type = type;
	newHouse.address = address;
	newHouse.bedrooms = bedrooms;
	newHouse.year = year;
	return newHouse;
}
}
