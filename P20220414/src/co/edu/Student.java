package co.edu;

public class Student {
	//필드 (Field)
	String name;
	String studNo;
	int age;
	double height;
	
	//생성자 (Constructor) : Instance를 만들어줄 때 처리할 기능을 정의
	//매개값이 없는 생성자 = 기본 생성자 -> 아무것도 적지 않으면 기본적으로 생성해줌
	//메소드와 달리 반환 타입이 없음
	//클래스 이름과 동일
	//필드의 초기값을 지정할 때
	//여러개 생성도 가능
	public Student() {
		
	}
	public Student(String nm, String sn) {
		name = nm;
		studNo = sn;
	}
	public Student(String nm, String num, int ag) {
		name = nm;
		studNo = num;
		age = ag;
	}
	
	public Student(String name, String studNo, int age, double height) {
		super();
		this.name =name;
		this.studNo = studNo;
		this.age = age;
		this.height = height;
		
	}
	//메소드 (Method)
	void study() {
		System.out.println(name+"(이)가 공부를 합니다.");
	}
	void eat() {
		System.out.println(name+"(이)가 식사를 합니다.");
	}
	void showInfo() {
		System.out.println("이름은 "+ name+"이고 학생 번호는 " + studNo +"이고 나이는 "+age+"이고 키는 "+height+"입니다.");
	}
}
