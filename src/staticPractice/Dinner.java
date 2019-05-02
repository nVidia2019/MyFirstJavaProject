  package staticPractice;

public class Dinner {
	public int pizzaSlices = 8;
	
	public void takeASlice() {
		pizzaSlices--;
	}
	
	public void takeASlice(int num) {
		pizzaSlices-= num;
	}
}
