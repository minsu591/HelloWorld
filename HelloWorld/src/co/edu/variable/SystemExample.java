package co.edu.variable;

import java.io.IOException;
//import java.util.Scanner;

public class SystemExample {
	public static void main(String[] args) {
//		// 표준 입출력 System.in, System.out
//		Scanner scn = new Scanner(System.in); //System.in : 키보드
//		//Scanner scn = new Scanner("홍길동 길동 박길동"); //사용자의 키보드를 읽어내는게 아니라 바로 읽고 출력, 외부 파일도 가능
//		
//		System.out.println("세 개의 단어를 입력하세요. 예) 안녕 방가 잘가");
//		
//		//hasNext -> 읽어올 값이 있는지 확인하는 메소드
//		while (scn.hasNext()) {
//			String str = scn.next(); //사용자가 입력한 값을 문자 형식으로 return
//			System.out.println(str); 
//			if(str.equals("exit")) {
//				break;
//			}
//		}
		//시스템의 값을 읽어오겠다는 read, 예외처리를 해야함.
		//더 이상 읽어들일 값이 없다 -> -1을 return
		
		System.out.println("숫자를 입력하세요.");
		while(true) {
			//읽어들인 값을 readByte에 저장
			int readByte;
			try {
				readByte = System.in.read();
				System.out.println(readByte);
				if(readByte == 97) {
					break;
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}			
		System.out.println("end of program");
	}
}