package co.edu.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MismatchEx {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		while (true) {// 숫자가 들어와야하는 자리인데 String이 들어올 때의 예외 처리
			System.out.println("1. 추가 | 2. 종료");
			System.out.print("선택 >> ");
			int menu = -1;
			
			//Exception
			try {
				Class.forName("java.lang.String"); //예외 처리 해줘야 컴파일 에러가 나타나지 않음
			} catch (ClassNotFoundException e2) {
				e2.printStackTrace(); //오류 메세지 작동
			}
			
			//RuntimeException
			try {
				//"10" -> 10, "ten", " " -> X? : 이 경우의 예외, NumberFormatException
				menu = Integer.parseInt(scn.next()); // 사용자가 입력한 값이 남아있기 때문에 nextLine을 넣지 않으면 무한반복
			} catch (InputMismatchException | NumberFormatException e1) { //다중 예외처리
				System.out.println("숫자를 입력해주세요!");
				scn.nextLine();
			} catch (ArrayIndexOutOfBoundsException e2) {
				System.out.println("배열의 범위를 넘어서 처리하려고 합니다");
				scn.nextLine();
			} catch(Exception e3) { //제일 상위의 예외처리
				System.out.println("알 수 없는 예외 발생");
			} finally {
				System.out.println("예외처리에서 반드시 한 번은 실행");
			}

			
			if (menu == 1) {
				System.out.println("추가작업");
			} else if (menu == 2) {
				break;
			}
		}
		System.out.println("end of prog");
	}

}
