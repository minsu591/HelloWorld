package co.test;

import java.util.Scanner;

// 변수 선언과 제어문 활용.
// 정수값을 받는 변수를 3개 선언하고 num1, num2, num3 의 변수에 저장.
// 제일 큰 값을 구하도록 기능을 구현하세요.
// 결과 => 3 수 중에서 가장 큰값은 100 입니다.
public class Exam1 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("첫번째 값을 입력하세요 >>> ");
		int num1 = scn.nextInt();
		System.out.print("두번째 값을 입력하세요 >>> ");
		int num2 = scn.nextInt();
		System.out.print("세번째 값을 입력하세요 >>> ");
		int num3 = scn.nextInt();
		
		int max = num1;
		if(max < num2) {
			max = num2;
		}
		if(max < num3) {
			max = num3;
		}
		System.out.println("3 수 중에서 가장 큰 값은 "+max+" 입니다.");
		
	}
}
