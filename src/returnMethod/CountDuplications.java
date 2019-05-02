package returnMethod;

public class CountDuplications {
public static void main(String[] args) {
	String[]arr = {"0", "1", "2", "5", "3", "4"};
	System.out.println(countDuplications(arr));
}
public static int countDuplications (String [] arr) {
	String unique = "";
	for(int outer = 0; outer < arr.length; outer++) {
		String currentStr = arr[outer];
		boolean duplicate = false; 
		
		for (int inner = 0; inner < arr.length; inner++)  {
			
			if (arr[inner].equals(currentStr) && inner != outer) {
				duplicate = true; // String is not unique, exit from inner loop 
				break;
			}
		}
		if (duplicate == false) {
			unique += currentStr + " ";
		}
	}
	unique = unique.trim();
	String[] uniqueArr = unique.split(" ");
	int count = arr.length - uniqueArr.length;
	return count;
}
}
