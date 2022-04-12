package co.edu.condition;

import java.util.Scanner;

public class SwitchExample {
	public static void main(String[] args) {
		//Switch 구문
		Scanner scn = new Scanner(System.in);
		System.out.println("피자의 종류를 입력하세요.");
		String pizza = scn.nextLine();
		int price = 0;
		
		switch(pizza) {
		//동일한 결과로 처리하고 싶을 때 케이스를 연달아 입력.
		case "콤비네이션":
		case "슈퍼슈프림":
			price = 20000;
			break;
		case "포테이토":
			price = 15000;
			break;
		case "쉬림프":
			price = 25000;
			break;
		default :
			price = 0;
		}
		System.out.println("피자 "+ pizza + "의 값은 "+ price +"입니다.");
		
	}
}
