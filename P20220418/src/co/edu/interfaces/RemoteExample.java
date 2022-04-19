package co.edu.interfaces;

public class RemoteExample { //리모컨 하나로 TV나 오디오 등 모든 가전제품을 컨트롤하고 싶다.
	public static void main(String[] args) {
		//상속관계에서는 부모클래스의 참조변수 자식클래스의 인스턴스가 할당.
		
//		RemoteControl rc = new RemoteControl(); //인터페이스는 인스턴스 생성 불가
		RemoteControl rc = new Television(); //RemoteControl이라는 인터페이스를 구현하는 Television
		rc.turnOn();
		rc.volumeUp();
		rc.volumeDown();
		rc.turnOff();
		//객체가 바뀌더라도 main method 안에서 실행하는 코드는 변하지 않음
		rc = new Audio();
		rc.turnOn();
		rc.volumeUp();
		rc.volumeDown();
		rc.turnOff();
		
		RemoteControl.changeBattery();
		
	}
}
