package co.edu.api;

import java.time.LocalDate;
import java.util.Scanner;

public class StringExample {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		// input : 주민번호, 생년월일-남/여 구분
		// ex) 950405-1348756 -> 95년 4월 5일 생, 남자입니다.
		// ex) 991001-1234567 -> 99년 10월 1일 생, 남자입니다.
		// ex) 9704051234567 ->이렇게 되어도 구분하게 만들기
		// ex) 0505053456789 -> 05년 5월 5일 생, 남자입니다.
		
		while(true) {
			System.out.print("주민번호를 입력해주세요 >>> ");
			String result = checkInfo(scn.next());
			System.out.println(result);
		}
	}

	public static String checkInfo(String jumin) {
		// 기능구현
		String[] checkArr = new String[2];
		checkArr[0]=jumin.substring(0,7);
		checkArr[1]=jumin.substring(jumin.length()-7);
		int birthYear = Integer.parseInt(checkArr[0].substring(0, 2));
		int birthMonth =  Integer.parseInt(checkArr[0].substring(2, 4));
		int birthDay = Integer.parseInt(checkArr[0].substring(4, 6));
		int gender = Integer.parseInt(checkArr[1].substring(0, 1));
		String genString = null;
		String returnString =" ";
		LocalDate ldate = LocalDate.now();
		
		if (birthYear < ldate.getYear()+1 && birthYear > 0) {
			if (gender == 3) {
				genString = "남자";
			} else if (gender == 4) {
				genString = "여자";
			}else {
				returnString="태어난 년도와 성별이 맞지 않습니다.";
			}
		} else {
			if (gender == 1) {
				genString = "남자";
			} else if (gender == 2) {
				genString = "여자";
			}else {
				returnString="태어난 년도와 성별이 맞지 않습니다.";
			}
		}
		if(genString !=null) {
			if(birthYear<10) {
				returnString = "0"+birthYear+"년 "+birthMonth+"월 "+birthDay+"일 생, "+genString+"입니다.";
			}else {
				returnString = birthYear+"년 "+birthMonth+"월 "+birthDay+"일 생, "+genString+"입니다.";
			}		
		}
		return returnString;
	}

}
