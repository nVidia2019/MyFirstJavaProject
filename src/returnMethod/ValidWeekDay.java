package returnMethod;

public class ValidWeekDay {
	public static void main(String[] args) {
	boolean valid = isValidDay("Monday");	
	System.out.println(valid);
	}
	
	public static boolean isValidDay (String day) {
		String [] week = {"monday", "tuesday", "wednesday", "thursday", "friday", "saturday", "sunday"};
		for (String weekDay : week) {
			if (day.equalsIgnoreCase(weekDay)) {
				return true;
			}else { 
				return false;
			}
		}
		return false;
	
	}
}
