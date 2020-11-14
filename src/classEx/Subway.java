package classEx;

public class Subway {
	String LineNumber;
	int passengerCount;
	int money;
	
	public Subway(String LineNumber) {
		this.LineNumber = LineNumber;
	}
	public void take(int money) {
		this.money += money; //수입증가
		passengerCount++; //승객수 증가
	}
	public void showInfo() {
		System.out.println(LineNumber+"의 승객은"
	      +passengerCount + "명이고,수입은"+money+"입니다");
	}

}
