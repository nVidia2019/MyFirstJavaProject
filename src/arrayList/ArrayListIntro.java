package arrayList;

import java.util.ArrayList;

public class ArrayListIntro {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();  // <=== general, raw type of ArrayList, we can add any variable type here
		list.add("Java");
		list.add(56);
		list.add(false);
		
		System.out.println(list);
		
		list.add(5.305);
		list.add('_');
		
		System.out.println(list);
		System.out.println(list.get(0));
		System.out.println(list.size());
		
		ArrayList<String> names = new ArrayList<>(); //or names = new ArrayList<>(); <=== restricted type, you can add only Strings
		names.add("John");
		names.add("Peter");
		
		System.out.println(names);
		int l = names.size();
		System.out.println("Number of names: " + l);
		String first = names.get(0);
		String last = names.get(names. size()- 1);
		System.out.println(first);
		System.out.println(last);
		
		list.remove(4);    // <=== to remove element of ArrayList
		System.out.println(list.toString());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
