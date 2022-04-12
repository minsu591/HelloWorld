package co.edu.condition;

import java.util.Scanner;

public class IfExample2 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("숫자를 입력해주세요.");
		int num = scn.nextInt();
		
		String msg = (num > 10) ? "10보다 크다" : "10보다 작다";
		System.out.println(msg);

		// 2의 배수인지 3의 배수인지, 2와 3의 공통배수인지 체크하는 프로그램
		if ((num % 2 == 0) && (num % 3 == 0)) {
			System.out.println(num+"은 2와 3의 공통 배수입니다.");
		} else if (num % 2 == 0) {
			System.out.println(num+ "은 2의 배수입니다.");
		} else if (num % 3 == 0) {
			System.out.println(num+ "은 3의 배수입니다.");
		} else {
			System.out.println(num+"은 2, 3의 배수가 아닙니다.");
		}

	}
}
