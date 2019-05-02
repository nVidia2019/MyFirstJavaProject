package arrayList;

import java.util.*;

public class EskimoHunt {
public static void main(String[] args) {
	ArrayList<String> hunting = new ArrayList<>();
	hunting.add("1");
	hunting.add("10");
	hunting.add("nanuk");
	hunting.add("nanuk");
	hunting.add("3");
	//hunting.add("5");
	int stones = 2;
	int boasts = 7;
	System.out.println(eskimoHunt(hunting, stones, boasts));
	
}
public static boolean eskimoHunt (ArrayList <String> found, int stones, int boasts) {
	boolean success = false;
	int nanuks = 0;
	int huntSum = 0;
	
	for (int i = 0; i < found.size(); i++) {
		if (found.get(i).equals("nanuk")) {
			nanuks += 1;
			found.remove(i);
			i--;
		}
	}
	for (String str: found) {
			huntSum += Integer.parseInt(str);
	}
	if (nanuks <= stones && huntSum >= boasts) {
			success = true;
	}else {
			success = false;
	}
	return success;
		
}
}
