package stringManipulation;

public class NurdinMentoring {
public static void main(String[] args) {
	String str1 = "$22.00";
	str1 = str1.replace("$", "").substring(0, str1.indexOf(".")-1);
	System.out.println(str1);
	int i = 22;
	
	if (i == Integer.parseInt(str1.replace("$", "")));
	 
}
}
