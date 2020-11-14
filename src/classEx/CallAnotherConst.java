package classEx;
class Person{
	String name;
	int age;
	
	Person(){
		this("이름없음",1);
	}
	Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	Person returnItSelf() {
		return this;
	}
	
}
public class CallAnotherConst {

	public static void main(String[] args) {
		Person noName = new Person();
		System.out.println(noName.name);
		System.out.println(noName.age);
		
		Person P = noName.returnItSelf();
		System.out.println(P);
		System.out.println(noName);

	}

}
