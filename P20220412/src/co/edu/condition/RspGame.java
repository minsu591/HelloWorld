package co.edu.condition;

import java.util.Scanner;

public class RspGame {

	public static void main(String[] args) {
		// 임의의 값 범위 (1 : 가위, 2 : 바위, 3 : 보)
		// 사용자 입력값 : (가위(1), 바위(2), 보(3)
		// 가위바위보 게임
		// 이기는 경우 : 1=2, 2=3, 3=1의 경우
		// 이외의 경우는 진다
		int rcpNum = (int) (Math.random() * 3 + 1);
//		System.out.println("확인용 : " + rcpNum);

		Scanner scn = new Scanner(System.in);
		System.out.println("가위(1), 바위(2), 보(3)를 입력하세요.");
		int inputRcp = scn.nextInt();
		
		if (rcpNum == 1 && inputRcp == 2) {
			System.out.println("승리하였습니다.");
		} else if (rcpNum == 2 && inputRcp == 3) {
			System.out.println("승리하였습니다.");
		} else if (rcpNum == 3 && inputRcp == 1) {
			System.out.println("승리하였습니다.");
		}else if(rcpNum == inputRcp) {
			System.out.println("비겼습니다.");
		}else {
			System.out.println("패배하였습니다.");
		}
		
	}

}
