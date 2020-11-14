package classEx;

public class Taxi {
	String TaxiNumber;
	int passengerCount;
	int money;
	
	public Taxi(String TaxiNnmber) {
		this.TaxiNumber = TaxiNumber;
	}
	public void take(int money) {
		this.money += money;
		passengerCount++;
	}
	public void showInfo() {
		System.out.println(TaxiNumber+"의 승객의"
	           + passengerCount+"명이고,수입은"+money+"입니다");
	}
	
}

