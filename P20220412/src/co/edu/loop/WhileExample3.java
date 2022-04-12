package co.edu.loop;

import java.util.Scanner;

public class WhileExample3 {
	public static void main(String[] args) {
		// UP DOWN게임
		// Math.random()의 생성범위 1 ~ 10까지가 되도록 : randomVal
		// 사용자의 입력값을 담는 변수 userVal
		// while 구문을 이용해서 임의의 값이랑 입력값이 같으면 종료
		// 사용자 값과 랜덤 값 비교, 입력한 값이 랜덤값보다 크다/작다
		
		Scanner scn = new Scanner(System.in);
		int randomVal = (int) (Math.random() * 10 + 1);
		int userVal = -1;
//		System.out.println("check : " + randomVal);

		while (true) {
			System.out.println("숫자를 입력하세요.");
			userVal = scn.nextInt();
			if (randomVal == userVal) {
				System.out.println("정답입니다!");
				break;
			} else if (userVal > randomVal) {
				System.out.println("DOWN");
			} else {
				System.out.println("UP");
			}
		}
		System.out.println("정답은 : "+ randomVal+"입니다!!");

		
	}
}
