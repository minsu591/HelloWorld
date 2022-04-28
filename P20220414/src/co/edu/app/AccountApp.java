package co.edu.app;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AccountApp {
	// AccountApp 클래스 : Account의 배열 -> 메뉴 : 1. 계좌생성 2. 입금 3. 출금 4. 목록조회 5. 종료 의 기능이
	// 있음
	Scanner scn = new Scanner(System.in);
	Account[] accounts = new Account[100]; // 계좌정보를 저장하기 위한 배열.

	public void intro(String no) {
		System.out.println("---------");
		System.out.println(no);
		System.out.println("---------");
	}

	// 계좌생성시 실행할 메소드
	public void createAccount() {
		boolean flag = true;
		this.intro("계좌 생성");
		System.out.print("계좌번호 : ");
		String newAccNo = scn.next();
		System.out.print("계좌주 : ");
		String newAccName = scn.next();
		try {
			System.out.print("초기입금액 : ");
			int newAccMoney = scn.nextInt();
			Account newAcc = new Account(newAccNo, newAccName, newAccMoney);
			for (int i = 0; i < accounts.length; i++) {
				if (accounts[i] != null) { //안 비어있는거 중에
					if(accounts[i].getAccountNo().equals(newAccNo)) {//입력한 계좌번호와 같은게 있는지
						flag = false;
						System.out.println("동일한 계좌번호가 존재합니다.");
						break;
					}
				}
			}
			if(flag) { //같은 계좌가 없으면
				for(int i = 0; i<accounts.length;i++) {
					if(accounts[i]==null) {//비어있는 곳을 찾아서 넣기
						accounts[i] = newAcc;
						break;
					}
				}
			}
			
			
		} catch (InputMismatchException e) {
			System.out.println("계좌생성 : 잘못된 입력입니다.");
			scn.nextLine();
		}
	}

	// 입금처리할 때 실행할 메소드
	public void deposit() {
		boolean flag = false;
		this.intro("입금");
		System.out.print("입금 계좌번호 : ");
		String deAccNo = scn.next();
		try {
			System.out.print("입금액 : ");
			int deAccMoney = scn.nextInt();
			for (int i = 0; i < accounts.length; i++) {
				if (accounts[i] != null && accounts[i].getAccountNo().equals(deAccNo)) {
					int befMoney = accounts[i].getAccountMon();
					accounts[i].setAccountMon(befMoney + deAccMoney);
					System.out.println("입금이 완료되었습니다.");
					accounts[i].getInfo();
					flag = false;
					break;
				} else {
					flag = true;
				}
			}
			if (flag) {
				System.out.println("입금 : 계좌가 존재하지 않습니다.");
			}
		} catch (InputMismatchException e) {
			System.out.println("잘못된 입력입니다.");
			scn.nextLine();
		}
	}

	// 출금처리할 때 실행할 메소드
	public void withdraw() {
		this.intro("출금");
		System.out.print("출금 계좌번호 : ");
		String wiAccNo = scn.next();
		try {
			System.out.print("출금액 : ");
			int wiAccMoney = scn.nextInt();
			boolean flag = false;
			for (int i = 0; i < accounts.length; i++) {
				if (accounts[i] != null && accounts[i].getAccountNo().equals(wiAccNo)) { // 비어있지 않고 계좌가 같다면?
					int befMoney = accounts[i].getAccountMon();
					if (befMoney < wiAccMoney) {
						System.out.println("잔액이 부족합니다.");
						flag = false;
						break;
					} else {
						befMoney -= wiAccMoney;
						accounts[i].setAccountMon(befMoney);
						System.out.println("출금이 완료되었습니다.");
						accounts[i].getInfo();
						flag = false;
						break;
					}
				} else {
					flag = true;
				}
			}
			if (flag) {
				System.out.println("계좌가 존재하지 않습니다.");
			}
		} catch (InputMismatchException e) {
			System.out.println("잘못된 입력입니다.");
			scn.nextLine();
		}

	}

	// 목록조회할 때 실행할 메소드
	public void accountList() {
		this.intro("목록 조회");
		System.out.printf("%-13s   %-3s   %-5s\n", "계좌번호", "계좌주", "잔액");
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i] != null) {
				accounts[i].getInfo();
			}
		}
	}

	// 전체 시스템 실행
	public void execute() {
		while (true) {
			int sel = -1;
			System.out.println("1. 계좌생성 | 2. 입금 | 3. 출금 | 4. 목록조회 | 5. 종료");
			try {
				System.out.print("입력 >>> ");
				sel = scn.nextInt();
			} catch (InputMismatchException e) {
				scn.nextLine();
			}
			if (sel == 1) { // 계좌생성
				createAccount();

			} else if (sel == 2) { // 입금
				this.deposit();

			} else if (sel == 3) { // 출금
				this.withdraw();
			} else if (sel == 4) { // 목록 조회
				this.accountList();

			} else if (sel == 5) { // 종료
				System.out.println("시스템을 종료합니다.");
				break;
			} else {
				System.out.println("잘못된 입력입니다.");
			}
		}
	}
}
