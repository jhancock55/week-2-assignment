package week2Assignment;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Coding Step 1
		//printout of Boolean Expressions
		
		
		// coding step 2
		//
		
		boolean isHotOutside = true;
		boolean isWeekday = true;
		boolean hasMoneyInPocket = false;
		
		// coding step 3
		
		double costOfMilk = 2.5;
		double moneyInWallet = 28.25;
		double thirstLevel = 8.5;
		
		// coding step 4
		
		boolean shouldBuyIcecream = isHotOutside && (moneyInWallet > 0);
		boolean willGoSwimming = isHotOutside && !isWeekday;
		boolean isAGoodDay = isHotOutside && hasMoneyInPocket && !isWeekday;
		boolean willBuyMilk = isHotOutside && (thirstLevel >= 3) && (moneyInWallet >= 2*costOfMilk);
		
		if (shouldBuyIcecream) {
			System.out.println("I should buy icecream today");
		}
		if (willGoSwimming) {
			System.out.println("I should buy will go swimming today");
		}
		if (isAGoodDay) {
			System.out.println("today is a good day");
		}
		if (willBuyMilk) {
			System.out.println("I will buy milk today");
		}
	}

}
