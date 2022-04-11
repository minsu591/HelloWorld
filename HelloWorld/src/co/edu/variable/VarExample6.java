package co.edu.variable;

public class VarExample6 {
	public static void main(String[] args) {
		String myName = "홍길동"; //참조 데이터 타입
		
		int age = 25; //기본 데이터 타입
		double height = 167.4;
		//변수 선언 후, 값 할당
		int mathScore, engScore;
		mathScore = 80;
		engScore = 90;
		
		//처음에 나오는 데이터 타입이 문자열이면 나머지는 다 문자열로 인식함.
		System.out.println(myName + "의 나이는 "+ age + "이고 키는 " + height + "cm 이고" + "영어, 수학 점수의 합은 " + (mathScore + engScore) + "입니다.");
		
		//String이 가지고 있는 메소드
		char firstChar = myName.charAt(0);
		System.out.println((int) firstChar);
		
		
	}

}
