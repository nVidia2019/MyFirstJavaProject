package arrayList;
import java.util.*;

public class SumOf2ArrayLists {
public static void main(String[] args) {
	ArrayList <Integer> numsList1 = new ArrayList<>();
	numsList1.add(2);
	numsList1.add(3);
	numsList1.add(5);
	numsList1.add(1);
	numsList1.add(4);
	//let's use method from the previous class
	ArrayList <Integer> numsList2 = new ArrayList<>();
	numsList2.add(1);
	numsList2.add(1);
	numsList2.add(0);
	numsList2.add(1);
	numsList2.add(2);
	System.out.println("Sum of list1: " + MethodsWithList.listSum(numsList1));
	System.out.println("Sum of list2: " + MethodsWithList.listSum(numsList2));
	System.out.println("Total sum of both lists: " + (MethodsWithList.listSum(numsList1) + MethodsWithList.listSum(numsList2))); 
}
}

