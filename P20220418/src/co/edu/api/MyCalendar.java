package co.edu.api;

import java.util.Calendar;

public class MyCalendar {
	public static void main(String[] args) {
		String y = "2020";
		String m = "05"; // 06이나 6이나 상관없음
		showCal(y, m);
	}

	public static void showCal(String year, String month) {
		// 달력 출력
		int m = Integer.parseInt(month);
		int y = Integer.parseInt(year);
		System.out.printf("[%4d년] %2d월\n", y, m);
		System.out.printf("%2s %2s %2s %2s %2s %2s %2s\n", "일", "월", "화", "수", "목", "금", "토");
		System.out.println("=====================");

		Calendar cl = Calendar.getInstance();
		m--; // Calendar가 1월을 0으로 치기때문에 입력 받은 값보다 -1
		cl.set(y, m, 1);
		int maxDate = cl.getActualMaximum(Calendar.DATE);
		int firstBlank = cl.get(Calendar.DAY_OF_WEEK);
		firstBlank--; //1일의 요일 -1;

		for (int i = 0; i < firstBlank; i++) {
			System.out.printf("%3s", " ");
		}
		for (int i = 1; i <= maxDate; i++) {
			System.out.printf("%3d", i);
			if ((i + firstBlank) % 7 == 0) {
				System.out.println();
			}
		}
		System.out.println("\n=====================");
		

	}

}
