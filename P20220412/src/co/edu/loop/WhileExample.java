package co.edu.loop;

import java.util.Scanner;

public class WhileExample {
	public static void main(String[] args) {
		// while구문
		// 1 ~ 10까지의 합 구하기
		int i = 1;
		int sum = 0;
		while(i <= 10) {
			sum += i;
			i++;
		}
		System.out.println("sum : "+sum);
		
		Scanner scn = new Scanner(System.in);
		boolean isTrue = true;
		sum = 0;
		while(isTrue) {
			System.out.println("숫자를 입력하세요. (종료 : -1)");
			int temp = scn.nextInt();
			if (temp == -1) {
				isTrue = false;
				continue;
			}
			sum += temp;
		}
		System.out.println("입력 값의 합은 "+sum+"입니다.");
	}
}