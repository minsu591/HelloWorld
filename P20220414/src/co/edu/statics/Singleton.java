//220415
package co.edu.statics;

public class Singleton {
	
	//같은 패키지 내에서 만든 class Car 사용 가능
	Car car;
	
	private static Singleton singleton = new Singleton();
	
	//private 생성자 : 외부에서 new 생성 불가능
	private Singleton(){
		
	}
	
	//클래스 소속 정적 메소드라 외부에서도 호출 가능
	public static Singleton getInstance() {
		return singleton;
	}

}
