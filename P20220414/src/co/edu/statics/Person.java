package co.edu.statics;

public class Person {
	final String nation = "Korea";
	final String ssn; //주민번호
	static final double PI = 3.14; //클래스 소속(static), 할당 후 값 변경 불가(final) => 상수 필드
	String name;
	
	public Person(String ssn, String name) {
		//초기화
		this.ssn = ssn;
		this.name = name;
	}
}
