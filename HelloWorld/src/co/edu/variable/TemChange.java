package co.edu.variable;

import java.util.Scanner;

public class TemChange {
	public static void main(String[] args) {
		//ChangeCToF 예제
		//섭씨온도 <-> 화씨온도
		//c = 5/9*(f-32)
		Scanner scn = new Scanner(System.in);
		
		System.out.println("화씨 온도를 입력하세요! >>> ");
		int f = scn.nextInt();
		double cel = 5.0/9*(f-32);
		
		//결과
		System.out.printf("화씨 온도 : %d℉ => 섭씨 온도 : %.1f℃",f,cel);
	}
}
