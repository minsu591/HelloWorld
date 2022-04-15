package co.edu.statics;

public class PersonExam {
	public static void main(String[] args) {
		Person p1 = new Person("234531-1324454","홍길동");
		p1.name = "hi";
//		p1.ssn = "merong"; //-> 수정할 수 없음
		
		Person p2 = new Person("234123-234235","김길동");
		System.out.println(p1.ssn);
		System.out.println(p2.ssn);
	}

}
