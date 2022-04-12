package co.edu.condition;

import java.util.Scanner;

public class RspGame {

	public static void main(String[] args) {
		//임의의 값 범위 (1 : 가위, 2 : 바위, 3 : 보)
		int rcpNum = (int) (Math.random()*3+1);
		System.out.println("확인용 : "+rcpNum);
		
		Scanner scn = new Scanner(System.in);
		System.out.println("가위, 바위, 보를 입력하세요.");
		String input = scn.nextLine();
		
		
	}

}
