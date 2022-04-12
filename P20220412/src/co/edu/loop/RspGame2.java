package co.edu.loop;

import java.util.Scanner;

public class RspGame2 {

	public static void main(String[] args) {
		int rndRcp = (int) (Math.random()*3+1);
//		System.out.println("check "+rndRcp);
		
		Scanner scn = new Scanner(System.in);
		System.out.println("가위, 바위, 보를 입력하세요");
		String rcpInput = scn.nextLine();
		
		if(rcpInput.equals("가위") && rndRcp == 3) {
			System.out.println("승리");
		}else if(rcpInput.equals("바위") && rndRcp == 1) {
			System.out.println("승리");
		}else if(rcpInput.equals("보")&& rndRcp ==2) {
			System.out.println("승리");
		}else {
			System.out.println("패배");
		}
	}

}
