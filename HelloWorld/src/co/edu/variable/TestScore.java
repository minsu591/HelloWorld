package co.edu.variable;

import java.util.Scanner;

public class TestScore {
	public static void main(String[] args) {
		// GetSumAverageMaxValue
		// 점수를 세 개 입력
		// 합, 평균, 고득점 구하기
		Scanner scn = new Scanner(System.in);
		int num1, num2, num3;
		System.out.println("첫 번째 점수를 입력하세요 >>> ");
		num1 = scn.nextInt();
		System.out.println("두 번째 점수를 입력하세요 >>> ");
		num2 = scn.nextInt();
		System.out.println("세 번째 점수를 입력하세요 >>> ");
		num3 = scn.nextInt();

		// 합
		int sum = num1 + num2 + num3;
		// 평균
		double avg = sum / 3.0;
		
		// 최고점1
		int maxNum = 0;
		if (num1 > maxNum) {
			maxNum = num1;
		}
		if (num2 > maxNum) {
			maxNum = num2;
		}
		if (num3 > maxNum) {
			maxNum = num3;
		}
		// 최고점2
		int maxNum2 = 0;
		if (num1 > num2) {
			maxNum2 = num1;
		} else {
			maxNum2 = num2;
		}
		if (maxNum2 < num3) {
			maxNum2 = num3;
		}
		// 최고점3 : maxNum에 num1 넣어서 비교하기

		System.out.printf("합은 %d이고 평균은 %.2f이고 최고점은 %d입니다.\n", sum, avg, maxNum);
		System.out.printf("합은 %d이고 평균은 %.2f이고 최고점은 %d입니다.", sum, avg, maxNum2);
	}
}
