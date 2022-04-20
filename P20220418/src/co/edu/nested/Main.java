package co.edu.nested;


public class Main {
	public static void main(String[] args) {
		Outer ou = new Outer();
		ou.method1();
		
		//instance 멤버 클래스
		Outer.Inner1 inner = ou.new Inner1();
		inner.method2();
		
		//static 멤버클래스
		Outer.Inner2.method5();
		
		Outer.Inner2 inner2 = new Outer.Inner2();
		inner2.method4(); //인스턴스 메소드
//		inner2.method5(); //정적 메소드 -> 가급적이면 이렇게 하지 않기
		

		
	}
}
