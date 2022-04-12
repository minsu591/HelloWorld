package co.edu.condition;

import java.util.Scanner;

public class DiceGame {
	public static void main(String[] args) {
		// 임의의 값 범위 (1~6 : 주사위의 면의 갯수)
		// 주사위 눈 맞추기 게임
		Scanner scn = new Scanner(System.in);
		int diceNum = (int) (Math.random() * 6 + 1);
//		System.out.println("확인 : "+diceNum);

		while (true) {
			System.out.println("주사위 면을 입력하세요.");
			int inputNum = scn.nextInt();
			if (inputNum == diceNum) {
				System.out.println("정답입니다!");
				break;
			} else {
				System.out.println("다시 입력해주세요...");
			}
		}

	}

}
