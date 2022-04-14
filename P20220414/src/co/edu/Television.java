package co.edu;
	//클래스
	//객체 	 -> 도면   -> TV(삼성, 엘지...)
	//Object -> Class -> Instance
	//추상화 : 속성의 필요한 부분만을 정리 (TV의 모든 속성을 정의하는게 아니라 필요한 부분만 사용)
public class Television {
	//속성 (field)
	String company;
	String model;
	int price;
	String color;
	
	//기능 (method)
	//메소드(반환유형, 메소드명, 매개변수)
	void turnOn(){
		System.out.println("텔레비젼을 켭니다.");
	}
	
	void turnOff(){
		System.out.println("텔레비젼을 끕니다.");
	}
	
	void changeChannel(int channel){
		System.out.println(channel + "번 채널로 변경합니다.");
	}
	
	
}
