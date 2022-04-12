package co.edu.variable;

public class OperatorExample {
	public static void main(String[] args) {
		// 나머지 : %
		// 6/4 => 몫 : 1, 나머지 : 2
		int result = 6 / 4; // 1
		System.out.println(result);
		int result2 = 6 % 4; // 2
		System.out.println(result2);

		int val = 5;
		if (val % 2 == 0) {
			System.out.println("짝수입니다.");
		} else {
			System.out.println("홀수입니다.");
		}

		// 나머지 활용 문제
		// 75300원
		// 5만원 => ?개, 1만원 => ?개, 5천원 => ?개
		// 1천원 => ?개, 500원 => ?개, 100원 => ?개
		int money = 75300;
		int num50000 = money / 50000;
		money = money % 50000;
		int num10000 = money / 10000;
		money = money % 10000;
		int num5000 = money / 5000;
		money = money % 5000;
		int num1000 = money / 1000;
		money = money % 1000;
		int num500 = money / 500;
		money = money % 500;
		int num100 = money / 100;
		money = money % 100;

		System.out.printf("5만원 => %d개, 1만원 => %d개, 5천원 => %d개, 1천원 => %d개, 500원 => %d개, 100원 => %d개\n", num50000, num10000, num5000, num1000, num500, num100);
				
	}
}
