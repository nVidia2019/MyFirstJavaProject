package returnMethod;

import java.util.Arrays;

public class LameDataBase {
public static void main(String[] args) {
	String db = "1test#2bla#3foo#4truit#5klfk#6fjdkfj#7rieoir#8rekjf";
	String op = "delete";
	String id = "7";
	String data = "yes";
	System.out.println(lameDataBase(db, op, id, data));
}
public static String lameDataBase (String db, String op, String id, String data) {
	String[] arr = db.split("#");
	int i = Integer.valueOf(id);
	if (op.equals("add")) {
		db = db + "#" + id + data;
		}
	if (op.equals("edit")) {
		arr[i - 1] = id + data;
		db = Arrays.toString(arr);
		db = db.replaceAll(", ", "#");
		db = db.replace("[", ""); //<== replaceAll gave an error
		db = db.replace("]", "");
	}
	if (op.equals("delete")) {
		arr[i - 1] = "";
		db = Arrays.toString(arr);
		db = db.replace("[", "");
		db = db.replace("]", "");
		db = db.replaceFirst(", ", "#"); //<=== you need to keep one #
		db = db.replaceAll(", ", "#");
		}else {
	return db;
	}
	return db;
}
}
