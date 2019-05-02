package arrayList;
import java.util.*;

public class TwoTimes {
public static void main(String[] args) {
	ArrayList<Integer> arrList1 = new ArrayList<>();
	arrList1.add(1);
	arrList1.add(2);
	arrList1.add(8);
	System.out.println(twoTimes(arrList1));
	
}
public static ArrayList <Integer> twoTimes (ArrayList<Integer> arrList1){
	ArrayList <Integer> arrList2 = new ArrayList<>();
	for (int i = 0; i < arrList1.size(); i++) {
		arrList2.add(arrList1.get(i));
		arrList2.add(arrList1.get(i));
	}
	return arrList2;
}
}
