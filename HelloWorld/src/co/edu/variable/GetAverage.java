package co.edu.variable;

import java.util.Scanner;

public class GetAverage {
	public static void main(String[] args) {
		// 정수형 입력값 -> num1, num2, num3 받아와서 double형의 avg에 평균내기
		Scanner scn = new Scanner(System.in);
		int num1, num2, num3;
		String myName = "김자반";
		int age = 30;
		System.out.println("첫 번째 수를 입력하세요.");
		num1 = scn.nextInt();
		System.out.println("두 번째 수를 입력하세요.");
		num2 = scn.nextInt();
		System.out.println("세 번째 수를 입력하세요.");
		num3 = scn.nextInt();

		// 정수 연산 => 정수
		// 10, 15, 15 => 40/3 => 13 (정수형으로 출력)
		// 계산하는 수 중에 하나라도 double 타입으로 했을 때 double로 나옴 (double형이 int형보다 데이터가 크기 때문)
		double avg;
		avg = (num1 + num2 + num3) / 3.0;

		// 결과값 : 입력한 세 정수는 10, 15, 15이고 평균은 13.3333 입니다.
		System.out.println("입력한 세 정수는 " + num1 + ", " + num2 + ", " + num3 + "이고 평균은 " + avg + "입니다.");

		// double의 포맷값을 지정할 수 있는 print : printf
		// %3s -> 문자열
		// %.2f -> 소수점 2자리까지
		// %2d -> 두 자리
		System.out.printf("이름은 %3s이고 평균은 %.2f이고 나이는 %2d입니다.\n", myName, avg, age);

		// 응용
		System.out.printf("입력한 세 정수는 %3d,%3d,%3d이고 평균은 %.2f입니다.\n", num1, num2, num3, avg);
	}
}