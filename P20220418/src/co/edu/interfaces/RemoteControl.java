package co.edu.interfaces;

public interface RemoteControl {
	//상수
	public int MAX_VOLUME =10; //따로 선언하지 않더라도 static final이 붙어있는 상수
	
	
	
	public void turnOn(); //구현부가 없는 메소드 = 선언부만 있는 메소드 -> 추상 메소드
	public void turnOff();
	public void volumeUp();
	public void volumeDown();
	public default void adjustScreen() {
		System.out.println("화면을 조정합니다.");
	}
	
	public static void changeBattery() { //인터페이스에서 기능을 담아서 호출
		System.out.println("건전지를 교환합니다.");
	}
	
}
