package arrayList;

import java.util.*;

public class ShuffleAndIfSortedCOPY {
public static void main(String[] args) {
	ArrayList<Integer> arrList1 = new ArrayList<>();
	arrList1.add(2);
	arrList1.add(5);
	arrList1.add(6);
	arrList1.add(10);
	
	System.out.println(arrList1);
	System.out.println(sortArrayList(arrList1));
	System.out.println(arrList1);
	System.out.println(shuffleArray(arrList1));
	System.out.println((Arrays.deepToString(sortedArrayCount(arrList1))));
}

public static int[][] sortedArrayCount (ArrayList<Integer> arrList){
		int count = 0;
		ArrayList<Integer> arrListSorted = sortArrayList(arrList);
		System.out.println();
		System.out.println(arrList);
		while (!arrListSorted.equals(arrList)) { //<===condition is never true (they are equal: arrList is SORTED) so it never enters the loop
			arrList = shuffleArray (arrList);
			count++;
		}
		
		int[] arr = new int[arrList.size()];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = arrList.get(i);
		}
		
		int[][] result = {{count}, arr};  
		return result;		   
}

public static ArrayList<Integer> shuffleArray (ArrayList<Integer> arrList1){
	Random random = new Random();
	ArrayList<Integer> arrList2 = new ArrayList<>();
	arrList2.addAll(arrList1);
	for (int i = 0; i < arrList1.size()-1; i++) {
		Integer temp = arrList2.get(random.nextInt(arrList2.size()));
		arrList1.set(i, temp);
		arrList2.remove(Integer.valueOf(temp));
	}
	arrList1.set(arrList1.size()-1, arrList2.get(0));
	
	return arrList1;
}

public static ArrayList<Integer> sortArrayList (ArrayList<Integer> arrList) {
   	Collections.sort(arrList);
    return arrList;
}
}


