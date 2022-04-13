package co.edu.array;

public class ArrayExample7 {
	public static void main(String[] args) {
		//달력 만들기 (다시 만든거 -> Calendar) 
		String[] days = {"Sun","Mon","Tue","Wed","Thu","Fri","Sat"};
		int month = 6;
		int lnth = getLastDay(month);
		int[] intAry = new int[lnth];
		
		//날짜 지정
		for (int i = 0; i < intAry.length; i++) {
			intAry[i] = i + 1;
		}
		//요일 출력 부분
		for(int i = 0; i< days.length;i++) {
			System.out.printf("%4s",days[i]);
		}
		System.out.println();
		
		//월 시작부분 공백처리
		int spc = getDayInfo(month);
		for (int i = 0; i< spc ; i++) {
			System.out.printf("%4s"," ");
		}
		for (int i = 0; i < intAry.length; i++) {
			System.out.printf("%4d", intAry[i]);
			if((i+spc)%7==6) { //index 6번째 끝나고 줄바꿈
				System.out.println();
			}
		}
	} //end of main();

	public static int getLastDay(int month) {
		switch(month) {
		case 3:
			return 31;
		case 4:
			return 30; //빈공간을 5개 return, 요일정보
		case 5:
			return 31;
		case 6:
			return 30;
		default:
			return 0;
		}
	}
	
	public static int getDayInfo(int month) {
		switch(month) {
		case 3:
			return 2;
		case 4:
			return 5; //빈공간을 5개 return, 요일정보
		case 5:
			return 0;
		case 6:
			return 3;
		default:
			return 0;
		}
	}
}
