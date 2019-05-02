package casting;

public class Task1 {
	public static void main(String[] args) {
		String str = "Published on Feb 12, 2021";
		int commaIndex = str.indexOf(",");
		String yearstr = str.substring(commaIndex + 2);
		int yearValue = Integer.valueOf(yearstr);
		
		if (yearValue <= 2019) {
			System.out.println("Valid year");
		}
		else {
			System.out.println("Invalid year");
		}
				
	}
}
