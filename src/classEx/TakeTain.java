package classEx;

public class TakeTain {

	public static void main(String[] args) {
		Student studentJames = new Student("James",5000);
		Student studentTomas = new Student("Tomas", 10000);
		Student studentEdward = new Student("Edward", 10000);
		
		Bus bus100 = new Bus(100); //노선 번호가 100번인 버스 생성
		studentJames.takeBus(bus100); //james가 100번 버스 탐
		studentJames.showInfo(); // james의 정보 출력
		bus100.showInfo(); // 버스 정보 출력
		
		Subway subwayGreen = new Subway("2호선");
		studentTomas.takeSubway(subwayGreen);
		studentTomas.showInfo();
		subwayGreen.showInfo();
		
		Taxi taxi100 = new Taxi(100);
		studentEdward.takeTaxi(taxi100);
		studentEdward.showInfo();
		taxi100.showInfo();
		
		}

}
