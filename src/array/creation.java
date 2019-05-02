package array;

public class creation {
public static void main(String[] args) {
	int[] numbers = new int[5]; // array is declared, it can hold 5 int;
	// while assigning start value index from 0
	numbers[0] = 234;
	numbers[1] = 432;
	numbers[2] = 100;
	numbers[3] = 234;
	numbers[4] = 432;
	// numbers[5] = 753;  this int will give error message as it's out of boundaries
System.out.println(numbers[0]);
numbers[0] = 1000;
System.out.println(numbers[0]);
numbers[0] = numbers[1] + numbers[2];
System.out.println(numbers[0]);

char[] grades = {'A', 'B', 'C', 'D', 'E'};
char[] grades2 = new char[] {'A', 'B', 'C', 'D', 'E'};
System.out.println(grades[0]);
char myGrade = grades[1];


}
}
