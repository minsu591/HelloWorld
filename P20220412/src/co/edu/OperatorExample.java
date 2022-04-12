package co.edu;

public class OperatorExample {

	public static void main(String[] args) {
		// 1. 증감 연산자
		int num1 = 10;
		int num2 = 20;
		num1 = num1 + 2; // num1의 값을 읽고 처리된 결과값을 대입.
		num1 = num1 + 2;
		System.out.println(num1);

		num1 = num1 + 1;
		num1 += 1;
		num1++; // 1을 누적연산
		System.out.println(num1); // 17
		System.out.println(num1++); // 17 (num1 출력 후 증가)
		System.out.println(++num1); // 19 (위에서 18이 되고 증가 후 출력)

		int result = num1++ + ++num2; // 19 + 21 = 40 (연산 시점)
		System.out.println(result + ", num1 : " + num1 + ", num2 : " + num2);

		// 2. 형별 연산에서 증감 연산자
		byte num3 = 10; // byte < short < int < long
//		num3 = num3 + 1; //Error : 정수연산은 int타입으로 처리 -> byte에 들어가지 않음
		num3 = (byte) (num3 + 1);

		num3 += 1; // 오류 X
		num3++;

		num3 = 125;
		num3++; // 126
		num3++; // 127
		num3++; // 128 => -128 (byte타입 범위에 넘어선다)
		num3++; // -127
		num3--; // -128
		num3--; // 127
		System.out.println(num3);
	}
}
