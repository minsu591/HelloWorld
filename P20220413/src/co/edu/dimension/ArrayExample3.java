package co.edu.dimension;

import java.util.Scanner;

public class ArrayExample3 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		// 변수 vs 배열
		// 변수 활용
		int num1, num2, num3, num4;
		System.out.print("첫 번째 값을 입력하세요 >>> ");
		num1 = scn.nextInt();
		System.out.print("두 번째 값을 입력하세요 >>> ");
		num2 = scn.nextInt();
		System.out.print("세 번째 값을 입력하세요 >>> ");
		num3 = scn.nextInt();
		System.out.print("네 번째 값을 입력하세요 >>> ");
		num4 = scn.nextInt();

		// 제일 작은 수 ~ 제일 큰 수의 순으로 출력하기 (오름차순)
		int[] intAry = { num1, num2, num3, num4 };
		for (int j = 0; j < intAry.length - 1; j++) { // 아래의 정렬 방법을 수의 갯수-1 만큼 반복해야 함
			for (int i = 0; i < intAry.length - 1; i++) {
				if (intAry[i] > intAry[i + 1]) {
					int saveNum = intAry[i + 1];
					intAry[i + 1] = intAry[i];
					intAry[i] = saveNum;
				}
			}
		}
		for (int i = 0; i < intAry.length; i++) {
			System.out.print(intAry[i] + " ");
		}
		System.out.println();

		// 내림차순
		for (int i = 0; i < intAry.length - 1; i++) {
			for (int j = 0; j < intAry.length - 1; j++) {
				if (intAry[i] < intAry[i + 1]) {
					int saveNum = intAry[i];
					intAry[i] = intAry[i+1];
					intAry[i+1] = saveNum;
				}
			}
		}
		for (int i = 0; i < intAry.length; i++) {
			System.out.print(intAry[i] + " ");
		}

	}

}
