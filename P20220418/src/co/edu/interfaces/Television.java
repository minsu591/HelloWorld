package co.edu.interfaces;
//인터페이스의 구현클래스를 통해서 코드가 구현이 되어야 함.
public class Television implements RemoteControl {  //티비 켜고, 끄고, 볼륨 업, 다운

	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다.");
	}

	@Override
	public void volumeUp() {
		System.out.println("TV의 Volume을 올립니다.");
	}

	@Override
	public void volumeDown() {
		System.out.println("TV 볼륨의 Volume을 내립니다.");
	}
	
	@Override
	public void adjustScreen() {
		adjustScreen();
	}
	
}
