package returnMethod;

public class ListNewTaskValidation {
public static void main(String[] args) {
	boolean b = true;
	int currentID = 7;
	int taskID = 9;
	String task = "1";
	System.out.println(validTask(b, currentID, taskID, task));
	
}
public static boolean validTask (boolean b, int currentTaskId, int taskID, String task) {
	String empty = "";
	if (b = true && taskID == currentTaskId+1 && task != empty)
		return true;
	else 
		return false;
}
}
