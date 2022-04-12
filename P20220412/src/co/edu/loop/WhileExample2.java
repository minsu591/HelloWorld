package co.edu.loop;

import java.util.Scanner;

public class WhileExample2 {
	public static void main(String[] args) {
		//While문 예제) 누적 합계가 200이 넘으면 반복문을 빠져나오게 한다.
		Scanner scn = new Scanner(System.in);
		boolean isTrue = true;
		int sum = 0;
				
		while(isTrue) {
			if(sum>=200) {
				System.out.println("누적 합계 : "+sum);
				break;
			}
			System.out.println("값을 입력하세요");
			int num = scn.nextInt();
			sum+=num;
		}
		
		
	}
}
