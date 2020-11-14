package classEx;

class BrithDay{
	int day;
	int month;
	int year;
	
	public void setYear(int year) {
		this.year = year;
	}
	public void printThis() {
		System.out.println(this);
	}
}

public class ThisEx1 {

	public static void main(String[] args) {
		BrithDay bDay = new BrithDay();
		bDay.setYear(2000);  //태어난 연도 2000년 으로 지정
		System.out.println(bDay);
		bDay.printThis();

	}

}
