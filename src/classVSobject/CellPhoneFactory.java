package classVSobject;

public class CellPhoneFactory {
public static void main(String[] args) {
	CellPhone phone1 = new CellPhone();
	phone1.brand = "Apple iPhone";
	phone1.color = "magenta";
	phone1.price = 999.0;
	
	phone1.call();
	phone1.text();
	System.out.println(phone1.brand);
	
	CellPhone phone2 = new CellPhone();
	CellPhone phone3 = new CellPhone();
	
	phone2.brand = "Ericsson 1018";
	phone2.color = "Silver";
	phone2.price = 1000.00;
	
	phone3.brand = "HTC Evo";
	phone3.color = "Black";
	phone3.price = 700.00;
	phone1.showBrand();
	
	double total = phone1.price + phone2.price +  phone3.price;
	System.out.println("Total for all 3 prices: " + total);
	
	phone1.price = phone3.price;
	System.out.println(phone1.price); 
}
}







