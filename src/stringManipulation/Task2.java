package stringManipulation;

public class Task2 {
public static void main(String[] args) {
	String garage = "Toyota, Nissan, Honda, BMW, Mazerati, Ford";
	garage = garage.toLowerCase();
	
	if (garage.isEmpty()) {
		System.out.println("No cars in the garage.");
	} else {
				if (garage.contains("toyota") || garage.contains("nissan")) 
					{System.out.println("There is a Japanese car in the garage.");}
				else {System.out.println("No Japanese cars.");}
				
				if (garage.contains("bmw")) 
					{System.out.println("here is a German car in the garage.");}
				else {System.out.println("No German cars.");}
			
				if (garage.contains("mazerati")) 
					{System.out.println("There is an Italian car in the garage.");}
				else {System.out.println("No italian cars.");}
				
				if (garage.contains("jaguar")) 
					{System.out.println("There is a British car in the garage.");}
				else {System.out.println("No British cars.");}
		}
	}
	}
	

