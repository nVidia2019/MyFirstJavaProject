package arrayList;
import java.util.*;
public class CreateRandomArrayList {
public static void main(String[] args) {
	int count = 10;
	ArrayList <Integer> newList = buildIntList(count);
	System.out.println(newList);
	System.out.println(MethodsWithList.listSum(buildIntList(5)));// <=== takes method from present calls, builds List, takes method from another class, calculates the sum
}
public static ArrayList <Integer> buildIntList(int count){
	Random random = new Random();
	ArrayList<Integer> numsList = new ArrayList<>();
	for (int i = 1; i <= count; i++) {
		numsList.add(random.nextInt(101));
	}
	
	return numsList;
}
}
