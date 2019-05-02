package stringManipulation;

public class SecondOccurence {
public static void main(String[] args) {
	String str = "applea";
	char ch = 'a';
	System.out.println(secondOccur(str, ch));
	}
public static int secondOccur (String str, char ch) {
	int count = 0;
	int found = 0;
	for (int i = 0; i < str.length(); i++) {
		if (str.charAt(i) == ch) {
			count++;
			if (count == 2) {
				found = i;
			}
		}
		
	}
	return found;
}
}
