package co.edu;

public class InheritExample {
	public static void main(String[] args) {
		Child1 c1 = new Child1();
		// Parent를 상속한 Child1의 필드, 메소드
		c1.field1 = "";
		c1.method1();
		// Child1이 가진 필드, 메소드
		c1.field2 = "";
		c1.method2();

		Child2 c2 = new Child2();
		// Parent를 상속한 Child2의 필드, 메소드
		c2.field1 = "";
		c2.method1();
		// Child2의 필드, 메소드
		c2.field3 = "";
		c2.method3();
		
		//부모의 참조변수에 자식인스턴스를 할당
		Parent p1 = new Parent();
		p1 = new Child1(); //int -> long, double처럼 promotion(자동형변환)이 일어남
		p1 = new Child2();
//		p1.field3 = ""; //X -> 부모 클래스가 가지고 있는 필드와 메소드만 활용 가능
		p1.field1="";
		p1.method1();
		
		
		c2 = (Child2) p1; //casting(강제형변환)도 가능
		c2.field1="";
		c2.field3="";
		c2.method1();
		c2.method3();

	}
}
