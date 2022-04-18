package co.edu.inherit;

public class Bus extends Car{
	//필드
	String busNo;
	
	//생성자
	public Bus() {
		super(); //부모자식의 관계 : super => 부모
		System.out.println("Bus() 생성자 호출");
	}
	
	//메소드
	public void fee() {
		System.out.println("요금을 받습니다.");
	}
	
	
	@Override //어노테이션 붙여두면 부모 클래스 규칙에 맞춰서 에러사항을 알려줌
	public void drive() { //부모 클래스가 가지고 있는 메소드를 자식이 재정의하는 (Overriding)
		System.out.println("버스가 운행을 합니다.");
	}

	@Override
	public String toString() {
		return "Bus [busNo=" + busNo + ", model = "+super.model+"]";
//		return super.toString(); //co.edu.inherit.Bus@b684286 => Object 클래스가 가진 toString 메소드 출력 / 메모리 주소를 출력하는 방식
	}
	
	
}
