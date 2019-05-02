package stringManipulation;

public class NameValidation {
	public static void main(String[] args) {
		String name = "Lawrence is cool";
		boolean check = name.contains("is cool"); // returns boolean and it is case sensitive
		System.out.println(check);
	}
}
