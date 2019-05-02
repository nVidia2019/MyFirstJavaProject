package varArgs;

public class VarArgsIntro {
public static void main(String[] args) {
	sum(10, 20); //<=== this method will accept only 2 numbers
	sumAll();
	sumAll(423, 45, 78, 89, 555);
}
public static void sum(int n1, int n2) {  //<=== this method will accept only 2 numbers
	System.out.println(n1 + n2);
}
public static void sumAll(int ... nums) { //< Varying Argument accepts any number of int or no int at all
	System.out.println("Number of inputs: " + nums.length);
	int sum = 0;
	for (int num : nums) {
		sum += num;
	}
	System.out.println("The sum is: " + sum);
}
}
