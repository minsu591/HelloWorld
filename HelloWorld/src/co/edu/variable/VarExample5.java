package co.edu.variable;

public class VarExample5 {

	public static void main(String[] args) {
		int val = 10; //4 * 1byte * => 1byte = 8 * bit; 값이 on/off
		
		//int가 담을 수 있는 최대 값은 2149483648
		//2149483648이상의 숫자로 long형의 변수를 선언하고 싶으면 마지막에 L붙이기
		long val2 = 2149483648L;
		//(promotion : 자동 형변환) 10 -> long 변환
		//작은 값 -> 큰 값 변환은 데이터 손실 X
		long val3 = 10L;
		
		//(casting : 강제형변환) 큰 값 -> 작은 값, 강제로 형변환 해주어야함.
		//문법적인 오류를 해결해주나,  값의 손실 O
		int val4 = (int) 2149483648L; //long -> int
		System.out.println(val4);

		int val5 = (int) 10L; //int 범위 내에 들어갈 수 있는 long형 데이터라면 값 손실 X
		
		long val6 = 10000000000L;
		long val7 = 10L;
		
		int result = (int) (val6 - val7);
		System.out.println(result); //1410065398
		
		//character
		char charLit = 97; //97에 해당되는 문자 (0 ~ 65535까지의 정수값에 각 문자를 배치)
		System.out.println(charLit); //가
		charLit = 44032;		
		System.out.println(charLit++); //각
		System.out.println(charLit++); //갂
		System.out.println(charLit++); //갃
		System.out.println(charLit++); //간
		System.out.println(charLit++); //갅
		System.out.println(charLit++);
		System.out.println(charLit++);
		System.out.println(charLit++);
		System.out.println(charLit++);
		System.out.println(charLit++);
		System.out.println(charLit++);
	}
}
