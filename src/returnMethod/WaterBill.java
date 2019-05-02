package returnMethod;

public class WaterBill {
public static void main(String[] args) {
	double gallons = 151;
	System.out.println("Your water bill for this month is: $" + waterBillCalculation(gallons));
}
public static double waterBillCalculation (double units) {
	double waterBill = 0;
	if (units < 50) {
		waterBill = units * 0.6;
	}else if (units >= 50 && units < 100) {
		waterBill = units * 0.9;
	}else if (units >= 100) {
		waterBill = units * 0.9 + 100;
	}
	return waterBill; 
}
}
