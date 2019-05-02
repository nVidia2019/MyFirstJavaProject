package returnMethod;

public class RoomBooking {
public static void main(String[] args) {
	int month = 9;
	int day = 2;
	int year = 2018;
	System.out.println(simpleRoomBooking(month, day, year));
}
public static boolean simpleRoomBooking (int month, int day, int year) {
	if (month == 7 && year == 2018) {
		if (day >= 1 && day <= 8) {
			return false;
		} 
	}
	if (year != 2018)
		return false;
	return true;
}
}
 