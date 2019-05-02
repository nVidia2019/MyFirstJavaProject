package encapsulation;

import java.util.*;

public class HouseBuilder {
	public static void main(String[] args) {
		House house1 = new House();
		house1.type = "townhouse";
		house1.address = "3938 N Lavergne, Chicago";
		int bedrooms = 4;
		house1.bedrooms = bedrooms;
		house1.year = 1990;
		
		House house2 = new House();
		house2.type = "condo";
		house2.address = "123 N Main, Chicago";
		house2.bedrooms = 3;
		house2.year = 1970;
		
		House house3 = new House();
		house3.type = "apartment";
		house3.address = "123 N Main, London";
		house3.bedrooms = 1;
		house3.year = 2000;
		
		House whiteHouse = new House();
		whiteHouse.type = "mansion";
		whiteHouse.address = "1 N Main Ave, Washington";
		whiteHouse.bedrooms = 23;
		whiteHouse.year = 1890;
		
		House EsqersHouse = new House();
		whiteHouse.type = "townhouse";
		whiteHouse.address = "4523 N Jones Str, Washington";
		whiteHouse.bedrooms = 3;
		whiteHouse.year = 1980;
		
		System.out.println("House type: " + house1.type);
		System.out.println("House type: " + house2.type);
		System.out.println("House type: " + house3.type);
		System.out.println("House type: " + whiteHouse.type);
		
		House[] houses = new House[5];		
		houses[0] = house1;  //<=====
		houses[1] = house2;
		houses[2] = house3;
		houses[3] = whiteHouse;
		houses[4] = EsqersHouse;
		System.out.println(houses[3].address);
		//System.out.println(houses[0].address);
		
		for (House h : houses) {
			System.out.println(h.address);
		}
		
		System.out.println("==ArrayList of House Objects=====");
		ArrayList<House> houseList = new ArrayList<>();
		houseList.add(house1);
		houseList.add(house2);
		houseList.add(house3);
		houseList.add(whiteHouse);
		houseList.add(EsqersHouse);
		
		ArrayList<House> houseList2 = new ArrayList<>(Arrays.asList(houses));
		List <House> housesList3 = Arrays.asList(houses); //<=== fixed size ArrayList
		
		for (House h : houseList) {
			if (h.year >= 2000 && h.year <= 2016) {
				System.out.println(h.type + " was built in " + h.year);
			}
		}
		
		for (int i = 0; i < housesList3.size(); i++) {
			House tempHouse = houseList.get(i);
				if (tempHouse.year >= 2000 && tempHouse.year <= 2016) {
					System.out.println(tempHouse.year + " | " + tempHouse.address);
				}
			}
		}

public static void printHouseInfo (House houseObj) {
	System.out.println("Type: " + houseObj.type);
	System.out.println("Address: " + houseObj.address);
	System.out.println("Bedrooms #: " + houseObj.bedrooms);
	System.out.println("Year: " + houseObj.year);
	
	
}


}
	


