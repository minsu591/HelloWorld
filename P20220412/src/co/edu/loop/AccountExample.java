package co.edu.loop;

import java.util.Scanner;

public class AccountExample {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int balance = 0;
		boolean run =true;
		
		while(run) {
			System.out.println("-------------------------");
			System.out.println("1. 예금 | 2. 출금 | 3. 조회 | 4. 종료");
			System.out.println("-------------------------");
			System.out.print("선택 >>> ");
			int menu = scn.nextInt();
			
			if(menu == 1) {
				//예금
				System.out.print("예금액 >>> ");
				int money = scn.nextInt();
				if(money > 0) {
					balance += money;					
					System.out.println("정상 처리되었습니다.");
				}else {
					System.out.println("잘못된 입력입니다.");
				}
			}else if(menu == 2) {
				//출금
				System.out.print("출금액 >>> ");
				int outMoney = scn.nextInt();
				if(outMoney >= balance) {
					System.out.println("잔고가 부족합니다.");
				}else {
					balance-=outMoney;
					System.out.println("정상 처리되었습니다.");
				}
			}else if(menu ==3) {
				//조회
				System.out.print("잔고 >>> "+balance+"\n");
			}else if(menu ==4) {
				//종료
				run = false;
			}else {
				System.out.println("잘못된 메뉴를 선택했습니다.");
			}
		} //end of while(run)
		System.out.println("프로그램 종료");
	}

}
