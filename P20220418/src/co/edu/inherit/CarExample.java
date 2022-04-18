package co.edu.inherit;

public class CarExample {
	public static void main(String[] args) {
		Bus b1 = new Bus();
		//부모에게 상속받은 필드, 메소드
		b1.model = "45인승 버스";
		b1.drive();
		//자식에서 새로 추가된 필드, 메소드 
		b1.busNo = "524";
		b1.fee();
		System.out.println(b1.toString());
		
		Taxi t1 = new Taxi();
		t1.model = "Sonata Taxi";
		t1.drive();
		
		t1.type = "개인택시";
		t1.metering();
		System.out.println(t1.toString());
		
		//자식 클래스의 인스턴스 => 부모 참조변수 할당가능
		//자식이 여럿일 때, 같은 배열 내에 자식을 담고싶으면
		Bus[] buses = new Bus[10];
		Taxi[] taxies = new Taxi[10];
		Car[] cars = new Car[10];
		cars[0] = t1; //promotion
		cars[1] = b1;
	}

}
