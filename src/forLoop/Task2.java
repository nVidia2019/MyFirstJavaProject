package forLoop;

import java.util.Scanner;

public class Task2 {
public static void main(String[] args) {
	System.out.println("Please enter a word to get the reverse of it:");
	Scanner input = new Scanner (System.in);
	String word = input.nextLine();    //String reversed
	String reversed = "";
	for (int ind = word.length()-1; ind >= 0; ind --) {
		reversed += word.charAt(ind);
}
	System.out.println(reversed);
}

}