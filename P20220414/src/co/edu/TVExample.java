package co.edu;

public class TVExample {
	public static void main(String[] args) {
		int num = 10;
		String str = "Hello";
		
		//TV Instance 생성
		Television tv = new Television();
		tv.company = "samsung";
		tv.color = "black";
		tv.price = 300000;
		tv.model = "30Inch";
		
		tv.turnOn();
		tv.changeChannel(10);
		tv.turnOff();
		
		Television tv1 = new Television();
		//new 연산자 -> 힙 영역에 객체 생성, 객체의 번지 리턴
		System.out.println(tv);
		System.out.println(tv1);
		tv1.company = "LG";
		
		
		//Student Instance 생성
		Student stud1 = new Student();
		stud1.name ="홍길동";
		stud1.studNo = "22-1234567";
		stud1.age = 20;
		stud1.height = 174.5;
		
		Student stud2 = new Student();
		stud2.name="김길동";
		stud2.studNo = "22-4532156";
		stud2.age = 30;
		stud2.height = 173.1;
		
		//필드를 지정하지 않고 시행했을 때 -> 초기값이 나옴 (ex. null, 0)
		
		Student stud3 = new Student("하잉","22-345224");
		stud3.age = 32;
		stud3.height =123.5;
		stud3.eat();
		stud3.showInfo();
		
		Student stud4 = new Student("오잉","23-2341423",27);
		stud4.eat();
		stud4.showInfo();
		
		//기능은 같지만 실행은 다름
		stud1.study();
		stud2.study();
		stud1.showInfo();
		stud2.showInfo();

	}

}
