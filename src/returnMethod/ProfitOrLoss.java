package returnMethod;

public class ProfitOrLoss {
public static void main(String[] args) {
	int buyPrice = 100;
	int sellPrice = 100;
	System.out.println(profitOrLoss(buyPrice, sellPrice));
}
public static String profitOrLoss(int buyPrice, int sellPrice) {
	String result = "";
		if (buyPrice < sellPrice) {
			result = "profit";
		}else if (buyPrice > sellPrice) {
			result = "loss";
		}else {
			result = "no profit, no loss";
		}
		return result;
}
}
