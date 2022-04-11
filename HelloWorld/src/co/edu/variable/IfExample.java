package co.edu.variable;

public class IfExample {
	public static void main(String[] args) {
		int myAge = 19;
		boolean over20; //변수의 길이는 무관, 의미있는 변수명 사용할 것, 변수 첫 자는 숫자X / 대문자는 클래스만 / 소문자 영어로
		over20 = myAge > 20; //
		
		if(over20) {
			System.out.println("over 20");
		} else {
			System.out.println("under 20");
		}
	}
}
