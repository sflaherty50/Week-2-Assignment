package weektwoproject;

public class Weektwoproject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//2
	boolean isHotOutside = true;
	boolean isWeekday = true;
	boolean hasMoneyInPocket = true;
	boolean isWeekend = true;
	
	System.out.println(isHotOutside); //a
	System.out.println(isWeekday); //b
	System.out.println(hasMoneyInPocket); //c
	System.out.println(isWeekend);
	
	//3
	double costOfMilk = 2.11;
	double moneyInWallet = 10.00;
	int thirstLevel = 5;
	
	System.out.println(costOfMilk); //a
	System.out.println(moneyInWallet); //b
	System.out.println(thirstLevel); //c
	
	//4a
	boolean ShouldBuyIceCream = costOfMilk <= 2.11 && isHotOutside == true;
	System.out.println(ShouldBuyIceCream);

	
	//4b
	boolean willGoSwimming = isHotOutside && isWeekend;
	System.out.println(willGoSwimming);
	
	//4c
	boolean isAGoodDay = isHotOutside && isWeekend && hasMoneyInPocket;
		System.out.println(isAGoodDay);
	
	
	//4d
	boolean willBuyMilk = isHotOutside == true  && thirstLevel >= 3 && moneyInWallet >= (costOfMilk*2); 
		System.out.println(willBuyMilk);
	}
	
	
	}


