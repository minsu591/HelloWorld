package co.edu.inherit;

import java.util.Scanner;

public class Game {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		// [0], [1], [2], [3], [4] => 무작위의 위치에 1~5 사이의 값을 생성 (중복되면 안됨)
		// [#], [#], [#], [#], [#] <= 5가 들어있는 위치를 찾는 게임
		// 무작위의 위치에 1~5 사이 값 생성
		
//		#1 (int cnt)
//		int[] ans = new int[5];
//		for (int i = 0; i < 5; i++) {
//			int rand = (int) (Math.random() * 5 + 1);
//			int cnt = 0; // 내부에 같은 숫자가 없는지 세는 수
//			for (int j = 0; j < 5; j++) {
//				if (rand != ans[j]) {
//					cnt++;
//				}
//			}
//			if (cnt == 5) {
//				ans[i] = rand;
//			} else {
//				i--; // 같은 과정을 반복
//			}
//		}

		// #2 (boolean flag)
		int[] ans2 = new int[5];
		for (int i = 0; i < 5; i++) {
			int rand2 = (int) (Math.random() * 5 + 1);
			boolean flag = false;
			for (int j = 0; j < i; j++) { //나 자신까지 비교할 필요 X
				if (ans2[j] == rand2) {
					flag = true;
					break;
				}
			}
			if (flag) {
				i--;
			} else {
				ans2[i] = rand2;
			}
		}

		//#2 반복문 확인
		for (int a : ans2) {
			System.out.print(a + " ");
		}
		System.out.println();
				
		//String 배열에 별 채우기
		String[] showAns = new String[ans2.length];
		for(int i = 0; i<showAns.length;i++) {
			showAns[i]="*";
		}
		
//		for(String p : showAns) { //향상된 for문 -> 값이 수정 안됨
//			p="**"; //바뀌는데 저장은 안된다?
//		}
		
		while(true) {
			System.out.print("5가 들어있는 위치를 고르세요 (1 ~ 5) >>> ");
			int sel = scn.nextInt();
			
			if(sel <=5 && sel>0) { //제한 내의 숫자일것
				showAns[sel-1]=Integer.toString(ans2[sel-1]); //선택한 숫자를 별배열에 배치하기
				for(int i = 0; i<showAns.length;i++) { //별 배열 프린트
					System.out.print("["+showAns[i]+"]");
				}
				System.out.println();
				if(ans2[sel-1]==5) { //정답이면 나가기
					System.out.println("정답입니다!");
					break;
				}else {
					System.out.println();
				}
			}
			
			
		}
	}

}
