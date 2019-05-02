package arrayList;
import java.util.*;

public class blogDataBase {
public static void main(String[] args) {
	ArrayList<String[]> arrListStr = new ArrayList<String[]>();
	String[] arr1 = {"1","title1","content1"};
	String[] arr2 = {"2","title2","content2"};
	String[] arr3 = {"3","title3","content3"};
	String[] arr4 = {"4","title4","content4"};
	arrListStr.add(arr1);
	arrListStr.add(arr2);
	arrListStr.add(arr3);
	arrListStr.add(arr4);
	String id = "4";
	blogDb(arrListStr, id);
}
public static void blogDb (ArrayList<String[]> arrListStr, String id){
	String [] arrResult = new String [2];
	int k = 0;
	for (int i = 0; i < arrListStr.size(); i++) {
			if (arrListStr.get(i)[0].equals(id)) {
			
				for (int j = 1; j < arrListStr.get(i).length; j++) {
					arrResult[k] = arrListStr.get(i)[j];
					k++;
				}
		}
	}
	for (String str: arrResult) {
		System.out.println(str);
	}
}
}
