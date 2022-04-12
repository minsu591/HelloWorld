package co.edu;

import java.util.Scanner;

public class CalTimeEx {
	public static void main(String[] args) {
		// 초를 입력받고 몇 분 몇 초라는 정보 주기
		Scanner scn = new Scanner(System.in);
		System.out.println("초(s)를 입력하세요.");
		int time = scn.nextInt();

		// 시, 분, 초
		int hour = time / 3600;
		time = time % 3600;
		int min = time / 60;
		time = time % 60;
		System.out.printf("%d시간 %d분 %d초 입니다.",hour, min, time);
		
		
//		int hours, minutes, secs;
//		hours = time / (60*60); // => 정수 연산의 결과
//		time = time % (60*60); // => 연산결과의 나머지를 time에 대입
//		
//		minutes = time / 60; // 1분으로 나누기 연산
//		time = time % 60;
//		
//		secs = time; //나머지 값을 secs 변수로 대입
//		
//		System.out.printf("%2d시 %2d분 %2d초",hours,minutes,secs);
	}
}
