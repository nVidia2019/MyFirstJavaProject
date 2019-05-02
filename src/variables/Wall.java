package variables;

import java.util.Scanner;

public class Wall {
	public static void main(String[] args) {
		
	Scanner input = new Scanner(System.in);
	int age = 23;
	age += 5;
	age = age - 1;
	System.out.println(age);
	int i = 5;
	i +=3;
	
	int minutes = 70;
	minutes %= 60; //minutes = minutes % 60;
	System.out.println(minutes);
	minutes *=3; //minutes = minutes * 3;
	System.out.println(minutes);
	}
			
	}

