package arrayList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListCreate {
public static void main(String[] args) {
	ArrayList<String> fruits1 = new ArrayList<>();
	List <String> fruits2 = new ArrayList<>();
	List <String> fruits3 = new ArrayList<>(10);
	List <String> fruits5 = Arrays.asList (new String [] {"Watermelon", "Peach", "Pineapple"});
	// fruits5.remove("Peach")  <==== unsupported operation;
	List<String> fruits6 = new ArrayList(fruits5);
	fruits6.add("Cherry");
	List<String> fruits7 = new ArrayList<>(Arrays.asList(new String[] {"Plum", "Cherry", "Banana"}));
	fruits7.add("Pear");
	fruits7.add("Blueberries");
	fruits7.add(0, "Orange");
	fruits7.add("Pomelo");
	fruits7.add(5, "Strawberries");
	System.out.println(fruits7);
	
	fruits1.clear();
	System.out.println(fruits1);
	fruits7.remove(7);
	System.out.println(fruits7);
	
	fruits2.removeAll(fruits1);
	
	List<Integer> nums = new ArrayList<>();
	nums.add(2);
	nums.add(3);
	nums.add(4);
	nums.add(5);
	
	nums.remove(new Integer (3)); // the right way to remove integers from ArrayList
	nums.remove(Integer.valueOf(3)); // another way of removing the integer
	System.out.println(nums);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
